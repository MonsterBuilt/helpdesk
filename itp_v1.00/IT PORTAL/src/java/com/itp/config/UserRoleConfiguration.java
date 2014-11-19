package com.itp.config;

import java.util.HashMap;

public class UserRoleConfiguration {

    public static final Integer ADMINISTATOR = 1;
    public static final Integer EMPLOYEE = 2;
    public static final Integer CLIENT = 3;
    public static final Integer APPLICANT = 4;
    private static HashMap Configuartion = new HashMap();

    /** Creates a new instance of ApplicationRoleConfiguration */
    public UserRoleConfiguration() {
    }

    public static void setConfigurationMap(HashMap configuration) {
        UserRoleConfiguration.Configuartion = configuration;
    }

    public static String getConfigurationValue(String key) {
        return (String) Configuartion.get(key);
    }

    public static HashMap getConfigurationMap() {
        return UserRoleConfiguration.Configuartion;
    }
}
