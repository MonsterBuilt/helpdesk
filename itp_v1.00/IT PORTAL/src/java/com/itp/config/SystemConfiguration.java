package com.itp.config;

import java.util.HashMap;

public class SystemConfiguration {

    public static final String APPLICATION_NAME = "application.name";
    
    private static HashMap<String, String> Configuartion = new HashMap();

    public SystemConfiguration() {
    }

    public static void setConfigurationMap(HashMap configuration) {
        SystemConfiguration.Configuartion = configuration;
    }

    public static String getConfigurationValue(String key) {
        return (String) Configuartion.get(key);
    }

    public static void setConfigurationValue(String key, String value) {
        Configuartion.put(key, value);
    }

    public static HashMap getConfigurationMap() {
        return SystemConfiguration.Configuartion;
    }
}
