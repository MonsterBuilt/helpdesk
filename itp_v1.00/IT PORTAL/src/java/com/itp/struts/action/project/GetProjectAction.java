package com.itp.struts.action.project;

import com.itp.beans.ProjectBean;
import com.itp.services.CommonDataServiceFacade;
import com.itp.services.ProjectManagementServiceFacade;
import com.itp.struts.form.ProjectFormBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class GetProjectAction extends Action {

    private CommonDataServiceFacade commonDataService;
    private ProjectManagementServiceFacade projectManagementService;
    private static Logger log = Logger.getLogger(GetProjectAction.class);

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

        ProjectBean bean = this.getProjectManagementService().getProject(formBean.getProjectId());
        
        
        request.setAttribute("projectForm", bean);
        return mapping.findForward("success");
    }
}
