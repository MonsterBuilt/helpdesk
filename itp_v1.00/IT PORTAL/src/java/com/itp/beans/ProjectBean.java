package com.itp.beans;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectBean {

    private Integer projectId;
    private Integer action;
    private String projectName;
    private String projectDescription;
    private Integer projectCategoryId;
    private String projectLeadId;
    private Integer statusId;
    private Integer priorityId;
    private String companyName;
    private String priorityName;
    private String projectStatusName;
    private String projectCategoryName;
    private String budgetString;
    private String projectLeadFullName;
    private Date startDate;
    private Date endDate;
    private String startDateString;
    private String endDateString;
    private Integer companyId;
    private Integer estimatedHours;
    private Double budget;
    private Double currentCost;
    private Integer assetId;
    private String userNameList;
    private ParticipantBean[] participantBeans;

    public ParticipantBean[] getParticipantBeans() {
        return participantBeans;
    }

    public String getUserNameList() {
        return userNameList;
    }

    public void setUserNameList(String userNameList) {
        this.userNameList = userNameList;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public void setParticipantBeans(ParticipantBean[] participantBeans) {
        this.participantBeans = participantBeans;
    }

    public Integer getProjectCategoryId() {
        return projectCategoryId;
    }

    public void setProjectCategoryId(Integer projectCategoryId) {
        this.projectCategoryId = projectCategoryId;
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

    public Date getEndDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            return sdf.parse(this.endDateString);
        } catch (Exception e) {
            System.out.println("Error parsing end date " + this.endDateString);
        }
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public Date getStartDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            return sdf.parse(this.startDateString);
        } catch (Exception e) {
            System.out.println("Error parsing start date " + this.startDateString);
        }
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getEndDateString() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
            return sdf.format(this.getEndDate());
        } catch (Exception e) {
            System.out.println("Error formatting start date " + this.getEndDate());
        }
        return endDateString;
    }

    public void setEndDateString(String endDateString) {
        this.endDateString = endDateString;
    }

    public String getStartDateString() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
            return sdf.format(this.getStartDate());
        } catch (Exception e) {
            System.out.println("Error formatting start date " + this.getStartDate());
        }
        return startDateString;
    }

    public void setStartDateString(String startDateString) {
        this.startDateString = startDateString;
    }

    public String getProjectCategoryName() {
        return projectCategoryName;
    }

    public void setProjectCategoryName(String projectCategoryName) {
        this.projectCategoryName = projectCategoryName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName;
    }

    public String getProjectStatusName() {
        return projectStatusName;
    }

    public void setProjectStatusName(String projectStatusName) {
        this.projectStatusName = projectStatusName;
    }

    public String getBudgetString() {
        try {

            NumberFormat nf = NumberFormat.getCurrencyInstance();
            return nf.format(this.getBudget());

        } catch (Exception e) {
            System.out.println("Error formatting budget " + this.getBudget());
        }

        return budgetString;
    }

    public void setBudgetString(String budgetString) {
        this.budgetString = budgetString;
    }

    public String getProjectLeadFullName() {
        return projectLeadFullName;
    }

    public void setProjectLeadFullName(String projectLeadFullName) {
        this.projectLeadFullName = projectLeadFullName;
    }
}
