package com.itp.struts.action.project;

import com.itp.beans.UserBean;
import com.itp.services.CommonDataServiceFacade;
import com.itp.struts.form.UserFormBean;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AddMemberOnProjectAction extends Action {

    private CommonDataServiceFacade commonDataService;
    private static Logger log = Logger.getLogger(AddMemberOnProjectAction.class);

    public AddMemberOnProjectAction() {
    }

    public CommonDataServiceFacade getCommonDataService() {
        return commonDataService;
    }

    public void setCommonDataService(CommonDataServiceFacade commonDataService) {
        this.commonDataService = commonDataService;
    }

    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        UserFormBean formBean = (UserFormBean) form;

        if (formBean.getAction() == formBean.GET_USER_PICKER_PAGE) {
            log.info("Gettting user picker page: " + formBean.getUserNameList());
            UserBean bean = new UserBean();
            bean.setUserNameList(formBean.getUserNameList());

            request.setAttribute("userBean", bean);
            this.setupForm(request);
            return mapping.findForward("get_user_picker");
        } else if (formBean.getAction() == formBean.ADD_USER_TO_PROJECT) {
            log.info("Adding project members: " + formBean.getUserNameList());

            //parse selected project members 
            List<UserBean> projectMembers = new ArrayList<UserBean>();
            String[] parts = formBean.getUserNameList().split(":");
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
            return mapping.findForward("add_user_to_project");
        } else if (formBean.getAction() == formBean.REMOVE_USER_TO_PROJECT) {
            log.info("Removing user from project:" + formBean.getUsername() + " " + formBean.getUserNameList());

            //pass selected project members 
            List<UserBean> projectMembers = new ArrayList<UserBean>();
            String[] parts = formBean.getUserNameList().split(":");
            Set<String> map = new HashSet<String>();

            for (String part : parts) {
                try {
                    String[] pa = part.split(";");
                    UserBean ubean = new UserBean();
                    ubean.setUsername(pa[0]);
                    ubean.setFullName(pa[1]);

                    if (ubean.getUsername().equals(formBean.getUsername())) {
                        continue;
                    }


                    if (!map.contains(ubean.getUsername())) {
                        projectMembers.add(ubean);
                        map.add(ubean.getUsername());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            log.info("Removing user: bean size: " + projectMembers.size());
            request.setAttribute("projectMembers", projectMembers);
            return mapping.findForward("add_user_to_project");
        }

        return mapping.findForward("success");
    }

    private void setupForm(HttpServletRequest request) {
        UserBean[] users = this.getCommonDataService().getAllUsers();

        request.setAttribute("users", users);
    }
}
