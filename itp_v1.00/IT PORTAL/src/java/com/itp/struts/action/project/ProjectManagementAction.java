package com.itp.struts.action.project;

import com.itp.beans.CompanyBean;
import com.itp.beans.ParticipantBean;
import com.itp.beans.PriorityBean;
import com.itp.beans.ProjectBean;
import com.itp.beans.ProjectCategoryBean;
import com.itp.beans.ProjectStatusBean;
import com.itp.beans.UserBean;
import com.itp.services.CommonDataServiceFacade;
import com.itp.services.ProjectManagementServiceFacade;
import com.itp.struts.form.ProjectFormBean;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class ProjectManagementAction extends Action {

    private CommonDataServiceFacade commonDataService;
    private ProjectManagementServiceFacade projectManagementService;
    private static Logger log = Logger.getLogger(ProjectManagementAction.class);

    public ProjectManagementAction() {
    }

    public CommonDataServiceFacade getCommonDataService() {
        return commonDataService;
    }

    public void setCommonDataService(CommonDataServiceFacade commonDataService) {
        this.commonDataService = commonDataService;
    }

    public ProjectManagementServiceFacade getProjectManagementService() {
        return projectManagementService;
    }

    public void setProjectManagementService(ProjectManagementServiceFacade projectManagementService) {
        this.projectManagementService = projectManagementService;
    }

    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        ProjectFormBean formBean = (ProjectFormBean) form;
        log.info("Creating new project action =  " + formBean.getAction());

        if (formBean.getAction() == formBean.GET_CREATE_PROJECT_PAGE) {
            formBean.setAction(2);
            this.setupForm(request);
            return mapping.findForward("get_create_project_page");

        } else if (formBean.getAction() == formBean.CREATE_PROJECT) {
            log.info("Create project username list: " + formBean.getUserNameList());

            //setup member list in client
            this.setMembers(formBean.getUserNameList(), request);

            ActionMessages errors = form.validate(mapping, request);

            validateStartDateAndEndDate(formBean.getStartDateString(), formBean.getEndDateString(), errors);

            if (errors != null && !errors.isEmpty()) {
                this.setupForm(request);
                this.saveErrors(request, errors);
                this.generateToken(request);

                log.info("Creating new project failed.");
                return mapping.findForward("create_project_failed");
            } else {
                ProjectBean bean = new ProjectBean();

                try {

                    BeanUtils.copyProperties(bean, formBean);

                } catch (Exception e) {
                    e.printStackTrace();
                }

                //save project
                bean = this.getProjectManagementService().saveProject(bean, 1);

                //add project members
                addProjectMembers(formBean.getUserNameList(), bean.getProjectId(), new ParticipantBean[0]);

                ActionMessages messages = new ActionMessages();
                ActionMessage message = new ActionMessage("create.project.success");
                messages.add("message1", message);
                this.saveMessages(request, messages);
                log.info("New project successfully added with id " + bean.getProjectId());

                //use GetProjectActionClass for retrieving project data
                request.setAttribute("projectForm", bean);
                return new ActionForward(mapping.findForward("create_project_success").getPath() + "?projectId=" + bean.getProjectId(), false);
            }
        } else if (formBean.getAction() == formBean.GET_EDIT_PROJECT_PAGE) {

            ProjectBean bean = this.getProjectManagementService().getProject(formBean.getProjectId());
            log.info("Getting edit project page: " + bean.getProjectName());
            bean.setAction(4);

            this.setupForm(request);

            String usernamelist = "";
            //construct projectmember string list {username;fullname:}
            if (bean != null && bean.getParticipantBeans() != null) {
                request.setAttribute("projectMembers", bean.getParticipantBeans());
            }

            bean.setUserNameList(usernamelist);
            request.setAttribute("projectForm", bean);

            return mapping.findForward("get_create_project_page");
        } else if (formBean.getAction() == formBean.EDIT_PROJECT) {
            log.info("Create project username list: " + formBean.getUserNameList());

            //setup member list in client
            this.setMembers(formBean.getUserNameList(), request);

            ActionMessages errors = form.validate(mapping, request);

            validateStartDateAndEndDate(formBean.getStartDateString(), formBean.getEndDateString(), errors);

            if (errors != null && !errors.isEmpty()) {
                this.setupForm(request);
                this.saveErrors(request, errors);
                this.generateToken(request);

                log.info("Creating new project failed.");
                return mapping.findForward("create_project_failed");
            } else {
                ProjectBean bean = new ProjectBean();

                try {

                    BeanUtils.copyProperties(bean, formBean);

                } catch (Exception e) {
                    e.printStackTrace();
                }

                //save project
                bean = this.getProjectManagementService().saveProject(bean, 2);

                //add project members 
                bean = this.getProjectManagementService().getProject(bean.getProjectId());
                addProjectMembers(formBean.getUserNameList(), bean.getProjectId(), bean.getParticipantBeans());

                ActionMessages messages = new ActionMessages();
                ActionMessage message = new ActionMessage("update.project.success");
                messages.add("message1", message);
                this.saveMessages(request, messages);
                log.info("New project successfully added with id " + bean.getProjectId());

                //use GetProjectActionClass for retrieving project data
                request.setAttribute("projectForm", bean);
                return new ActionForward(mapping.findForward("create_project_success").getPath() + "?projectId=" + bean.getProjectId(), false);
            }
        }


        return mapping.findForward("invalidSession");
    }

    private void setMembers(String usernameList, HttpServletRequest request) {
        try {
            log.info("Creating new project setup users: " + usernameList);

            //parse selected project members 
            if (usernameList != null && usernameList.length() > 0) {
                List<UserBean> projectMembers = new ArrayList<UserBean>();
                String[] parts = usernameList.split(":");
                Set<String> map = new HashSet<String>();

                for (String part : parts) {
                    try {
                        String[] pa = part.split(";");
                        UserBean ubean = new UserBean();
                        ubean.setUsername(pa[0]);
                        ubean.setFullName(pa[1]);

                        if (!map.contains(ubean.getUsername())) {
                            projectMembers.add(ubean);
                            map.add(ubean.getUsername());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                request.setAttribute("projectMembers", projectMembers);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addProjectMembers(String usernameList, Integer projectId, ParticipantBean[] pbeans) {
        try {
            String[] parts = usernameList.split(":");
            List<ParticipantBean> toAdd = new ArrayList<ParticipantBean>();
            Set<String> map = new HashSet<String>();
            
            for(ParticipantBean pbean : pbeans) {
                pbean.setProjectId(projectId);
                pbean.setRoleId(1);
                map.add(pbean.getUsername());
            }
            
            log.info(map);

            for (String part : parts) {
                String[] pa = part.split(";");
                ParticipantBean bean = new ParticipantBean();
                try {
                    bean.setProjectId(projectId);
                    bean.setUsername(pa[0]);
                    bean.setRoleId(1);

                    if (!map.contains(bean.getUsername())) {
                        toAdd.add(bean);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            this.getProjectManagementService().saveProjectMembersAsBatch(toAdd);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //start date should be before end date
    private void validateStartDateAndEndDate(String startDate, String endDate, ActionMessages errors) {

        try {

            startDate = startDate + " 00:00:00";
            endDate = endDate + " 00:00:00";

            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

            Date start = sdf.parse(startDate);
            Date end = sdf.parse(endDate);

            if (start.compareTo(end) >= 0) {
                errors.add("error", new ActionMessage("project.startdate.enddate.error"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setupForm(HttpServletRequest request) {
        UserBean[] users = this.getCommonDataService().getAllUsers();
        CompanyBean[] companies = this.getCommonDataService().getAllCompanies();
        ProjectStatusBean[] projectStatus = this.getCommonDataService().getAllProjectStatus();
        PriorityBean[] priorities = this.getCommonDataService().getAllPriorities();
        ProjectCategoryBean[] projectCategories = this.getCommonDataService().getAllProjectCategories();

        request.setAttribute("projectCategories", projectCategories);
        request.setAttribute("priorities", priorities);
        request.setAttribute("projectStatus", projectStatus);
        request.setAttribute("companies", companies);
        request.setAttribute("users", users);
    }
}
