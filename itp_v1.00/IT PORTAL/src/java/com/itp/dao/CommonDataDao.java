package com.itp.dao;

import com.itp.dao.entity.Company;
import com.itp.dao.entity.Month;
import com.itp.dao.entity.Priority;
import com.itp.dao.entity.ProjectCategory;
import com.itp.dao.entity.ProjectStatus;
import com.itp.dao.entity.State;
import com.itp.dao.entity.User;

public interface CommonDataDao {

    public Month[] getAllMonths() throws Exception;

    public State[] getAllStates() throws Exception;

    public User[] getAllUsers() throws Exception;

    public Company[] getAllCompanies() throws Exception;

    public ProjectStatus[] getAllProjectStatus() throws Exception;

    public Priority[] getAllPriorities() throws Exception;
    
    public ProjectCategory[] getAllProjectCategories() throws Exception;
}
