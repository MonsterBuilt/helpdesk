package com.itp.beans;

public class ConfigurationBean {

    private String configurationKey;
    private Integer configurationCategoryId;
    private String username;
    private String configurationValue;
    private String configurationDescription;

    /** Creates a new instance of ConfigurationBean */
    public ConfigurationBean() {
    }

    public String getConfigurationKey() {
        return configurationKey;
    }

    public void setConfigurationKey(String configurationKey) {
        this.configurationKey = configurationKey;
    }

    public Integer getConfigurationCategoryId() {
        return configurationCategoryId;
    }

    public void setConfigurationCategoryId(Integer configurationCategoryId) {
        this.configurationCategoryId = configurationCategoryId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getConfigurationValue() {
        return configurationValue;
    }

    public void setConfigurationValue(String configurationValue) {
        this.configurationValue = configurationValue;
    }

    public String getConfigurationDescription() {
        return configurationDescription;
    }

    public void setConfigurationDescription(String configurationDescription) {
        this.configurationDescription = configurationDescription;
    }
}
