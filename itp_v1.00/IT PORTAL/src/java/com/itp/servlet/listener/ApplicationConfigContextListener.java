package com.itp.servlet.listener;

import com.itp.beans.ConfigurationBean;
import com.itp.cache.StaticDataCache;
import com.itp.services.CommonDataServiceFacade;
import com.itp.services.ConfigurationServiceFacade;
import com.itp.config.SystemConfiguration;
import java.util.HashMap;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.apache.log4j.Logger;

public class ApplicationConfigContextListener implements ServletContextListener {

    private static Logger log = Logger.getLogger(ApplicationConfigContextListener.class);

    /** Creates a new instance of ApplicationConfigContextListener */
    public ApplicationConfigContextListener() {
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("################################################");
        System.out.println("----------- STOPPING " + sce.getServletContext().getRealPath("").toUpperCase() + " APPLICATION -----------");
        System.out.println("################################################");
        System.out.println("");
    }

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("################################################");
        System.out.println("----------- STARTING " + sce.getServletContext().getRealPath("").toUpperCase() + " APPLICATION -----------");
        System.out.println("################################################");
        System.out.println("");

        try {
            Context initialContext = new InitialContext();

            String springConfigFile = "/config/spring/applicationContext.xml";

            //ApplicationContext ac = new ClassPathXmlApplicationContext(springConfigFile);
            ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
            loadAllStaticData(ac);
            loadSystemConfiguration(ac);

            System.out.println("");
            System.out.println("################################################");
            System.out.println("- APLICATION CONFIGURATION LOADED SUCCESSFULLY -");
            System.out.println("################################################");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            System.out.println("################################################");
            System.out.println("- APLICATION CONFIGURATION LOADED FAILED -");
            System.out.println("################################################");
            System.out.println("");
            e.printStackTrace();
        }

    }

    private void loadAllStaticData(ApplicationContext ac) {
        CommonDataServiceFacade service = (CommonDataServiceFacade) ac.getBean("commonDataService");

        StaticDataCache.putCache(StaticDataCache.DAYS_CACHE, service.getAllDaysInMonth());
        StaticDataCache.putCache(StaticDataCache.MONTHS_CACHE, service.getAllMonthBeans());
        StaticDataCache.putCache(StaticDataCache.STATES_CACHE, service.getAllStates());
    }

    private void loadSystemConfiguration(ApplicationContext ac) {
        ConfigurationServiceFacade configService = (ConfigurationServiceFacade) ac.getBean("configurationService");
        ConfigurationBean[] systemConfigs = configService.getConfigurationBeansWithId(new Integer(1));

        if (systemConfigs != null && systemConfigs.length > 0) {
            HashMap sysConfigMap = new HashMap();
            for (ConfigurationBean cb : systemConfigs) {
                sysConfigMap.put(cb.getConfigurationKey(), cb.getConfigurationValue());
            }
            SystemConfiguration.setConfigurationMap(sysConfigMap);
        }
    }
}
