package com.itp.struts.action.project;

import com.itp.beans.ListProjectBean;
import com.itp.beans.ProjectBean;
import com.itp.services.ProjectManagementServiceFacade;
import com.itp.struts.form.ListProjectFormBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ListProjectAction extends Action {

    private ProjectManagementServiceFacade projectManagementService;
    private static Logger log = Logger.getLogger(ListProjectAction.class);

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

        ListProjectFormBean formBean = (ListProjectFormBean) form;
        
        ListProjectBean bean = new ListProjectBean();
        ProjectBean[] beans = this.getProjectManagementService().
                listProjects("", 0, 0, 0, 10, 1);
        int total = this.getProjectManagementService().getTotoalProjects("", 0);
        
        bean.setTotalResults(total);
        bean.setProjects(beans);
        request.setAttribute("searchResults", bean);

        return mapping.findForward("success");
    }
}
