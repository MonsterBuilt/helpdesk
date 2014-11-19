package com.itp.dao;

import com.itp.dao.entity.Participant;
import com.itp.dao.entity.Project;
import java.util.List;

public interface ProjectDao {

    public Project saveProject(Project entity, int mode) throws Exception;

    public Project getProject(Integer id) throws Exception;

    public boolean saveProjectMembersAsBatch(List<Participant> entities) throws Exception;

    public Participant[] getProjectMembers(Integer projectId) throws Exception;

    public Project[] listProjects(String searchString, int orderBy, int order, int filter, int maxResult, int beginIndex) throws Exception;
    
    public int getTotoalProjects(String searchString, int filter) throws Exception;
}
