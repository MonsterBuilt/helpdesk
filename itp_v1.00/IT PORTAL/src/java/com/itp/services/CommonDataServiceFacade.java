package com.itp.services;

import com.itp.beans.CompanyBean;
import com.itp.beans.DayBean;
import com.itp.beans.MonthBean;
import com.itp.beans.PriorityBean;
import com.itp.beans.ProjectCategoryBean;
import com.itp.beans.ProjectStatusBean;
import com.itp.beans.StateBean;
import com.itp.beans.UserBean;

public interface CommonDataServiceFacade {

    public DayBean[] getAllDaysInMonth();

    public MonthBean[] getAllMonthBeans();

    public StateBean[] getAllStates();

    public UserBean[] getAllUsers();

    public CompanyBean[] getAllCompanies();

    public ProjectStatusBean[] getAllProjectStatus();

    public PriorityBean[] getAllPriorities();

    public ProjectCategoryBean[] getAllProjectCategories();
}
