package com.itp.services;

import com.itp.beans.ConfigurationBean;

public interface ConfigurationServiceFacade
{
    
    public ConfigurationBean[] getConfigurationBeansWithId(Integer id);
    public ConfigurationBean updateConfiguration (String key, String value);
    public ConfigurationBean getConfigurationBeanFromKeys (Integer categoryId, String key, String username);
    
}
