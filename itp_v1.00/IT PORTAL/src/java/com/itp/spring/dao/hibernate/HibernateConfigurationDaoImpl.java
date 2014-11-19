package com.itp.spring.dao.hibernate;

import com.itp.dao.ConfigurationDao;
import com.itp.dao.entity.Configuration;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HibernateConfigurationDaoImpl extends HibernateDaoSupport implements ConfigurationDao {

    public HibernateConfigurationDaoImpl() {
    }

    public Configuration[] getConfigurationsWithId(Integer id) throws DataAccessException {
        Session session = SessionFactoryUtils.getSession(getSessionFactory(), true);

        try {

            Criteria criteria = session.createCriteria(Configuration.class);
            criteria.createAlias("configurationCategory", "conf");
            criteria.add(Restrictions.eq("conf.configurationCategoryId", id));

            List list = criteria.list();

            Configuration[] configurations = (Configuration[]) list.toArray(new Configuration[list.size()]);

            return configurations;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        } finally {
            SessionFactoryUtils.releaseSession(session, getSessionFactory());
        }

    }

    public Configuration updateConfiguration(String key, String value) throws DataAccessException {
        Session session = SessionFactoryUtils.getSession(getSessionFactory(), true);

        try {

            Criteria criteria = session.createCriteria(Configuration.class);
            criteria.add(Restrictions.eq("configurationKey", key));

            Configuration entity = (Configuration) criteria.uniqueResult();

            if (entity != null) {
                entity.setConfigurationValue(value);
                this.getHibernateTemplate().update(entity);
            }


            return entity;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        } finally {
            SessionFactoryUtils.releaseSession(session, getSessionFactory());
        }

    }

    public Configuration getConfigurationFromKeys(Integer categoryId, String key, String username) throws DataAccessException {
        Session session = SessionFactoryUtils.getSession(getSessionFactory(), true);

        try {

            Criteria criteria = session.createCriteria(Configuration.class);
            criteria.add(Restrictions.eq("configurationKey", key));
            criteria.add(Restrictions.eq("configurationCategoryId", categoryId));
            if (username != null && username.length() > 0) {
                criteria.add(Restrictions.eq("username", username));
            }
            Configuration entity = (Configuration) criteria.uniqueResult();

            return entity;
        } catch (HibernateException he) {
            throw SessionFactoryUtils.convertHibernateAccessException(he);
        } finally {
            SessionFactoryUtils.releaseSession(session, getSessionFactory());
        }

    }
}
