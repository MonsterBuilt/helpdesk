package com.itp.struts.form;

import org.apache.struts.validator.ValidatorForm;

public class ProjectFormBean extends ValidatorForm {

    public static final int GET_CREATE_PROJECT_PAGE = 1;
    public static final int CREATE_PROJECT = 2;
    public static final int GET_EDIT_PROJECT_PAGE = 3;
    public static final int EDIT_PROJECT = 4;
    
    private Integer projectId;
    private String projectName;
    private Integer projectCategoryId;
    private String projectDescription;
    private String projectLeadId;
    private Integer statusId;
    private Integer priorityId;
    private String startDateString;
    private String endDateString;
    private Integer companyId;
    private Integer estimatedHours;
    private Double budget;
    private Double currentCost;
    private Integer assetId;
    private String userNameList;
    private int action;

    public String getUserNameList() {
        return userNameList;
    }

    public void setUserNameList(String userNameList) {
        this.userNameList = userNameList;
    }
 
    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public ProjectFormBean() {
    }

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(Double currentCost) {
        this.currentCost = currentCost;
    }

    public Integer getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(Integer estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectLeadId() {
        return projectLeadId;
    }

    public void setProjectLeadId(String projectLeadId) {
        this.projectLeadId = projectLeadId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getProjectCategoryId() {
        return projectCategoryId;
    }

    public void setProjectCategoryId(Integer projectCategoryId) {
        this.projectCategoryId = projectCategoryId;
    }

    public String getEndDateString() {
        return endDateString;
    }

    public void setEndDateString(String endDateString) {
        this.endDateString = endDateString;
    }

    public String getStartDateString() {
        return startDateString;
    }

    public void setStartDateString(String startDateString) {
        this.startDateString = startDateString;
    }
}
