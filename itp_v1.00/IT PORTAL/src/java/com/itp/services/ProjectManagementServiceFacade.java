package com.itp.services;

import com.itp.beans.ParticipantBean;
import com.itp.beans.ProjectBean;
import java.util.List;

public interface ProjectManagementServiceFacade {

    public ProjectBean saveProject(ProjectBean bean, int mode);

    public ProjectBean getProject(Integer id);

    public boolean saveProjectMembersAsBatch(List<ParticipantBean> beans);

    public ProjectBean[] listProjects(String searchString, int orderBy, int order, int filter, int maxResult, int beginIndex);

    public int getTotoalProjects(String searchString, int filter);
}
