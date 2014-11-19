package com.itp.spring.dao.hibernate;

import com.itp.dao.ProjectDao;
import com.itp.dao.entity.Participant;
import com.itp.dao.entity.Project;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HibernateProjectDaoImpl extends HibernateDaoSupport implements ProjectDao {

    private static Logger log = Logger.getLogger(HibernateProjectDaoImpl.class);

    public HibernateProjectDaoImpl() {
    }

    public Project saveProject(Project entity, int mode) throws DataAccessException {

        try {

            if (mode == 1) {
                Integer id = (Integer) this.getHibernateTemplate().save(entity);

                entity.setProjectId(id);
            } else if (mode == 2) {
                this.getHibernateTemplate().update(entity);
            }
            return entity;
        } catch (HibernateException he) {
            he.printStackTrace();
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }
    }

    public Project getProject(Integer id) throws DataAccessException {

        try {
            Project entity = (Project) this.getHibernateTemplate().load(Project.class, id);

            return entity;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }

    }

    public boolean saveProjectMembersAsBatch(List<Participant> entities) throws DataAccessException {

        try {
            this.getHibernateTemplate().saveOrUpdateAll(entities);

            return true;
        } catch (HibernateException he) {
            he.printStackTrace();
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }

    }

    public Participant[] getProjectMembers(Integer projectId) throws DataAccessException {
        Session session = SessionFactoryUtils.getSession(getSessionFactory(), true);

        try {
            Participant[] entities = null;

            Criteria criteria = session.createCriteria(Participant.class);

            criteria.createAlias("project", "proj");
            criteria.add(Restrictions.eq("proj.projectId", projectId));

            List list = criteria.list();

            log.info("Participants in hibernate: " + list.size() + " project id: " + projectId);
            entities = (Participant[]) list.toArray(new Participant[list.size()]);

            return entities;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);

        } finally {
            SessionFactoryUtils.releaseSession(session, getSessionFactory());
        }
    }

    public Project[] listProjects(String searchString, int orderBy, int order, int filter, int maxResult, int beginIndex) throws DataAccessException {
        Session session = SessionFactoryUtils.getSession(getSessionFactory(), true);

        try {
            Project[] entities = null;

            Criteria criteria = session.createCriteria(Project.class);

            List list = criteria.list();

            entities = (Project[]) list.toArray(new Project[list.size()]);

            return entities;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        } finally {
            SessionFactoryUtils.releaseSession(session, getSessionFactory());
        }
    }

    public int getTotoalProjects(String searchString, int filter) throws DataAccessException {
        Session session = SessionFactoryUtils.getSession(getSessionFactory(), true);

        try {
            Integer count = (Integer) session.createQuery("select count(*) from Project").uniqueResult();

            return count.intValue();
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        } finally {
            SessionFactoryUtils.releaseSession(session, getSessionFactory());
        }
    }
}
