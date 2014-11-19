package com.itp.spring.dao.hibernate;

import com.itp.dao.CommonDataDao;
import com.itp.dao.entity.Company;
import com.itp.dao.entity.Month;
import com.itp.dao.entity.Priority;
import com.itp.dao.entity.ProjectCategory;
import com.itp.dao.entity.ProjectStatus;
import com.itp.dao.entity.State;
import com.itp.dao.entity.User;
import java.util.List;
import org.hibernate.HibernateException;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HibernateCommonDataDaoImpl extends HibernateDaoSupport implements CommonDataDao {

    public Month[] getAllMonths() throws DataAccessException {
        Month[] entities = null;
        try {
            List list = this.getHibernateTemplate().loadAll(Month.class);

            if (list != null && list.size() > 0) {
                entities = (Month[]) list.toArray(new Month[list.size()]);
            }

            return entities;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }
    }

    public State[] getAllStates() throws DataAccessException {
        State[] entities = null;
        try {
            List list = this.getHibernateTemplate().loadAll(State.class);

            if (list != null && list.size() > 0) {
                entities = (State[]) list.toArray(new State[list.size()]);
            }

            return entities;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }
    }

    public User[] getAllUsers() throws DataAccessException {
        User[] users = null;
        try {
            List list = this.getHibernateTemplate().loadAll(User.class);

            if (list != null && list.size() > 0) {
                users = (User[]) list.toArray(new User[list.size()]);
            }

            return users;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }
    }

    public Company[] getAllCompanies() throws DataAccessException {
        Company[] companies = null;
        try {
            List list = this.getHibernateTemplate().loadAll(Company.class);

            if (list != null && list.size() > 0) {
                companies = (Company[]) list.toArray(new Company[list.size()]);
            }

            return companies;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }
    }

    public ProjectStatus[] getAllProjectStatus() throws DataAccessException {
        ProjectStatus[] projectStatus = null;
        try {

            List list = this.getHibernateTemplate().loadAll(ProjectStatus.class);

            if (list != null && list.size() > 0) {
                projectStatus = (ProjectStatus[]) list.toArray(new ProjectStatus[list.size()]);
            }

            return projectStatus;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }
    }

    public Priority[] getAllPriorities() throws DataAccessException {
        try {
            Priority[] priorities = null;

            List list = this.getHibernateTemplate().loadAll(Priority.class);

            if (list != null && list.size() > 0) {
                priorities = (Priority[]) list.toArray(new Priority[list.size()]);
            }

            return priorities;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }
    }

    public ProjectCategory[] getAllProjectCategories() throws DataAccessException {
        try {
            ProjectCategory[] projectCategories = null;
            
            List list = this.getHibernateTemplate().loadAll(ProjectCategory.class);
            
            if(list != null && list.size() > 0) {
                projectCategories = (ProjectCategory[]) list.toArray(new ProjectCategory[list.size()]);
            }
            
            return projectCategories;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        }
    }
}
   
       
  

