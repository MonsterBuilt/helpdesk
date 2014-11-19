package com.itp.services.impl;

import com.itp.beans.CompanyBean;
import com.itp.beans.DayBean;
import com.itp.beans.MonthBean;
import com.itp.beans.PriorityBean;
import com.itp.beans.ProjectCategoryBean;
import com.itp.beans.ProjectStatusBean;
import com.itp.beans.StateBean;
import com.itp.beans.UserBean;
import com.itp.dao.CommonDataDao;
import com.itp.dao.entity.Company;
import com.itp.dao.entity.Month;
import com.itp.dao.entity.Priority;
import com.itp.dao.entity.ProjectCategory;
import com.itp.dao.entity.ProjectStatus;
import com.itp.dao.entity.State;
import com.itp.dao.entity.User;
import com.itp.services.CommonDataServiceFacade;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

public class CommonDataServiceImpl implements CommonDataServiceFacade {

    private CommonDataDao CommonDataDao;
    private static Logger log = Logger.getLogger(CommonDataServiceImpl.class);

    public CommonDataDao getCommonDataDao() {
        return CommonDataDao;
    }

    public void setCommonDataDao(CommonDataDao CommonDataDao) {
        this.CommonDataDao = CommonDataDao;
    }

    public DayBean[] getAllDaysInMonth() {
        DayBean[] beans = new DayBean[31];

        for (int i = 1; i <= 31; i++) {
            DayBean day = new DayBean();
            day.setDayDescription(i + "");
            day.setDayId(i);

            beans[i - 1] = day;
        }

        return beans;
    }

    public MonthBean[] getAllMonthBeans() {
        MonthBean[] beans = null;
        try {
            Month[] entities = this.getCommonDataDao().getAllMonths();

            if (entities != null && entities.length > 0) {
                beans = new MonthBean[entities.length];

                for (int i = 0; i < entities.length; i++) {
                    MonthBean bean = new MonthBean();
                    BeanUtils.copyProperties(bean, entities[i]);
                    beans[i] = bean;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return beans;
    }

    public StateBean[] getAllStates() {
        try {
            State[] entities = this.getCommonDataDao().getAllStates();

            StateBean[] beans = null;

            if (entities != null) {
                beans = new StateBean[entities.length];

                for (int i = 0; i < entities.length; i++) {
                    StateBean bean = new StateBean();

                    try {
                        BeanUtils.copyProperties(bean, entities[i]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    beans[i] = bean;
                }
            }
            return beans;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserBean[] getAllUsers() {

        try {

            User[] entities = this.getCommonDataDao().getAllUsers();
            UserBean[] beans = null;


            if (entities != null) {
                beans = new UserBean[entities.length];

                for (int i = 0; i < entities.length; ++i) {
                    UserBean bean = new UserBean();

                    try {

                        BeanUtils.copyProperties(bean, entities[i]);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    beans[i] = bean;
                }

                return beans;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public CompanyBean[] getAllCompanies() {

        try {
            Company[] entities = this.getCommonDataDao().getAllCompanies();
            CompanyBean[] beans = null;

            if (entities != null) {
                beans = new CompanyBean[entities.length];

                for (int i = 0; i < entities.length; ++i) {
                    CompanyBean bean = new CompanyBean();

                    try {

                        BeanUtils.copyProperties(bean, entities[i]);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    beans[i] = bean;
                }

                return beans;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ProjectStatusBean[] getAllProjectStatus() {

        try {
            ProjectStatus[] entities = this.getCommonDataDao().getAllProjectStatus();
            ProjectStatusBean[] beans = null;

            if (entities != null) {
                beans = new ProjectStatusBean[entities.length];

                for (int i = 0; i < entities.length; ++i) {
                    ProjectStatusBean bean = new ProjectStatusBean();

                    try {
                        BeanUtils.copyProperties(bean, entities[i]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    beans[i] = bean;
                }

                return beans;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public PriorityBean[] getAllPriorities() {

        try {
            Priority[] entities = this.getCommonDataDao().getAllPriorities();
            PriorityBean[] beans = null;

            if (entities != null) {
                beans = new PriorityBean[entities.length];

                for (int i = 0; i < entities.length; ++i) {
                    PriorityBean bean = new PriorityBean();

                    try {

                        BeanUtils.copyProperties(bean, entities[i]);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    beans[i] = bean;
                }

                return beans;
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ProjectCategoryBean[] getAllProjectCategories() {

        try {
            ProjectCategory[] entities = this.getCommonDataDao().getAllProjectCategories();
            ProjectCategoryBean[] beans = null;

            if (entities != null) {
                beans = new ProjectCategoryBean[entities.length];

                for (int i = 0; i < entities.length; ++i) {
                    ProjectCategoryBean bean = new ProjectCategoryBean();

                    try {

                        BeanUtils.copyProperties(bean, entities[i]);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    beans[i] = bean;
                }

                return beans;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}


