package com.itp.dao;

import com.itp.dao.entity.Configuration;

public interface ConfigurationDao {

    public Configuration[] getConfigurationsWithId(Integer id) throws Exception;

    public Configuration updateConfiguration(String key, String value) throws Exception;

    public Configuration getConfigurationFromKeys(Integer categoryId, String key, String username) throws Exception;
}
