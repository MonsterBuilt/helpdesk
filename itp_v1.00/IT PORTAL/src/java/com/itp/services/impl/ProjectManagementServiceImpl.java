package com.itp.services.impl;

import com.itp.beans.ParticipantBean;
import com.itp.beans.ProjectBean;
import com.itp.dao.ProjectDao;
import com.itp.dao.entity.Company;
import com.itp.dao.entity.Participant;
import com.itp.dao.entity.Priority;
import com.itp.dao.entity.Project;
import com.itp.dao.entity.ProjectCategory;
import com.itp.dao.entity.ProjectStatus;
import com.itp.dao.entity.Role;
import com.itp.dao.entity.User;
import com.itp.services.ProjectManagementServiceFacade;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

public class ProjectManagementServiceImpl implements ProjectManagementServiceFacade {

    private ProjectDao projectDao;
    private static Logger log = Logger.getLogger(ProjectManagementServiceImpl.class);

    public ProjectDao getProjectDao() {
        return projectDao;
    }

    public void setProjectDao(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    public ProjectBean saveProject(ProjectBean bean, int mode) {

        try {
            Project entity = new Project();

            BeanUtils.copyProperties(entity, bean);

            Company company = new Company();
            company.setCompanyId(bean.getCompanyId());
            entity.setCompany(company);

            ProjectStatus status = new ProjectStatus();
            status.setProjectStatusId(bean.getStatusId());
            entity.setProjectStatus(status);

            Priority priority = new Priority();
            priority.setPriorityId(bean.getPriorityId());
            entity.setPriority(priority);

            ProjectCategory category = new ProjectCategory();
            category.setProjectCategoryId(bean.getProjectCategoryId());
            entity.setProjectCategory(category);

            User user = new User();
            user.setUsername(bean.getProjectLeadId());
            entity.setUser(user);

            entity = this.getProjectDao().saveProject(entity, mode);
            bean.setProjectId(entity.getProjectId());

            return bean;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ProjectBean getProject(Integer id) {

        try {
            Project entity = this.getProjectDao().getProject(id);
            ProjectBean bean = new ProjectBean();

            BeanUtils.copyProperties(bean, entity);

            Company company = entity.getCompany();
            if (company != null) {
                BeanUtils.copyProperties(bean, company);
            }

            ProjectStatus status = entity.getProjectStatus();
            if (status != null) {
                BeanUtils.copyProperties(bean, status);
            }

            Priority priority = entity.getPriority();
            if (priority != null) {
                BeanUtils.copyProperties(bean, priority);
            }

            ProjectCategory category = entity.getProjectCategory();
            if (category != null) {
                BeanUtils.copyProperties(bean, category);
            }

            User user = entity.getUser();
            if (user != null) {
                String fullName = user.getFirstName() + " " + user.getLastName();
                bean.setProjectLeadFullName(fullName);
            }

            log.info("Size of participants in set: " + entity.getParticipants().size());

            if (entity.getParticipants() != null) {
                ParticipantBean[] pbeans = new ParticipantBean[entity.getParticipants().size()];
                int i = -1;

                for (Participant participant : entity.getParticipants()) {
                    try {
                        ParticipantBean pa = new ParticipantBean();
                        User ur = participant.getUser();

                        if (ur != null) {
                            pa.setUsername(ur.getUsername());
                            pa.setFullName(ur.getFirstName() + " " + ur.getLastName());
                        }
                        log.info("Participants: " + pa.getFullName());
                        pbeans[++i] = pa;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                bean.setParticipantBeans(pbeans);
            }

            return bean;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean saveProjectMembersAsBatch(List<ParticipantBean> beans) {

        try {
            List<Participant> entities = new ArrayList<Participant>();

            for (ParticipantBean bean : beans) {
                Participant entity = new Participant();

                //entity.setParticipantId(0);
                Project project = new Project();
                project.setProjectId(bean.getProjectId());
                entity.setProject(project);

                User user = new User();
                user.setUsername(bean.getUsername());
                entity.setUser(user);

                Role role = new Role();
                role.setRoleId(bean.getRoleId());
                entity.setRole(role);

                entities.add(entity);
            }

            this.getProjectDao().saveProjectMembersAsBatch(entities);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public ProjectBean[] listProjects(String searchString, int orderBy, int order, int filter, int maxResult, int beginIndex) {

        try {
            Project[] entities = this.getProjectDao().listProjects(searchString, orderBy, order, filter, maxResult, beginIndex);
            ProjectBean[] beans = new ProjectBean[entities.length];

            for (int i = 0; i < entities.length; ++i) {
                ProjectBean bean = new ProjectBean();

                BeanUtils.copyProperties(bean, entities[i]);

                Company company = entities[i].getCompany();
                if (company != null) {
                    BeanUtils.copyProperties(bean, company);
                }

                ProjectStatus status = entities[i].getProjectStatus();
                if (status != null) {
                    BeanUtils.copyProperties(bean, status);
                }

                Priority priority = entities[i].getPriority();
                if (priority != null) {
                    BeanUtils.copyProperties(bean, priority);
                }

                ProjectCategory category = entities[i].getProjectCategory();
                if (category != null) {
                    BeanUtils.copyProperties(bean, category);
                }

                User user = entities[i].getUser();
                if (user != null) {
                    String fullName = user.getFirstName() + " " + user.getLastName();
                    bean.setProjectLeadFullName(fullName);
                }

                //log.info("Size of participants in set: " + entities[i].getParticipants().size());

                beans[i] = bean;
            }

            return beans;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public int getTotoalProjects(String searchString, int filter) {

        try {
            return this.getProjectDao().getTotoalProjects(searchString, filter);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }
}


