package com.itp.services.impl;

import com.itp.beans.ConfigurationBean;
import com.itp.dao.ConfigurationDao;
import com.itp.dao.entity.Configuration;
import com.itp.services.ConfigurationServiceFacade;
import org.apache.commons.beanutils.BeanUtils;

public class ConfigurationServiceImpl implements ConfigurationServiceFacade {

    private ConfigurationDao configurationDao;

    public ConfigurationServiceImpl() {
    }

    public ConfigurationDao getConfigurationDao() {
        return configurationDao;
    }

    public void setConfigurationDao(ConfigurationDao configurationDao) {
        this.configurationDao = configurationDao;
    }

    public ConfigurationBean[] getConfigurationBeansWithId(Integer id) {
        ConfigurationBean[] beans = null;
        try {
            Configuration[] entities = this.configurationDao.getConfigurationsWithId(id);

            if (entities != null && entities.length > 0) {
                beans = new ConfigurationBean[entities.length];

                int i = 0;
                for (Configuration entity : entities) {
                    ConfigurationBean bean = new ConfigurationBean();
                    BeanUtils.copyProperties(bean, entity);

                    beans[i] = bean;
                    i++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return beans;


    }

    public ConfigurationBean updateConfiguration(String key, String value) {
        ConfigurationBean bean = null;
        try {
            this.getConfigurationDao().updateConfiguration(key, value);
            bean = new ConfigurationBean();
            bean.setConfigurationKey(key);
            bean.setConfigurationValue(value);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bean;

    }

    public ConfigurationBean getConfigurationBeanFromKeys(Integer categoryId, String key, String username) {
        ConfigurationBean bean = null;
        try {
            Configuration entity = this.getConfigurationDao().getConfigurationFromKeys(categoryId, key, username);
            if (entity != null) {
                bean = new ConfigurationBean();
                BeanUtils.copyProperties(bean, entity);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return bean;
    }
}
