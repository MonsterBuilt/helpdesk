package com.itp.dao.entity;
// Generated Jun 17, 2011 1:34:28 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Project generated by hbm2java
 */
public class Project  implements java.io.Serializable {


     private Integer projectId;
     private ProjectStatus projectStatus;
     private ProjectCategory projectCategory;
     private Company company;
     private User user;
     private Priority priority;
     private String projectName;
     private String projectDescription;
     private Date startDate;
     private Date endDate;
     private int estimatedHours;
     private Double budget;
     private Double currentCost;
     private int assetId;
     private Set<Note> notes = new HashSet<Note>(0);
     private Set<Participant> participants = new HashSet<Participant>(0);
     private Set<Version> versions = new HashSet<Version>(0);
     private Set<Asset> assets = new HashSet<Asset>(0);

    public Project() {
    }

	
    public Project(Integer projectId, ProjectStatus projectStatus, ProjectCategory projectCategory, Company company, User user, Priority priority, Date startDate, Date endDate, int estimatedHours, int assetId) {
        this.projectId = projectId;
        this.projectStatus = projectStatus;
        this.projectCategory = projectCategory;
        this.company = company;
        this.user = user;
        this.priority = priority;
        this.startDate = startDate;
        this.endDate = endDate;
        this.estimatedHours = estimatedHours;
        this.assetId = assetId;
    }
    public Project(ProjectStatus projectStatus, ProjectCategory projectCategory, Company company, User user, Priority priority, String projectName, String projectDescription, Date startDate, Date endDate, int estimatedHours, Double budget, Double currentCost, int assetId, Set<Note> notes, Set<Participant> participants, Set<Version> versions, Set<Asset> assets) {
       this.projectStatus = projectStatus;
       this.projectCategory = projectCategory;
       this.company = company;
       this.user = user;
       this.priority = priority;
       this.projectName = projectName;
       this.projectDescription = projectDescription;
       this.startDate = startDate;
       this.endDate = endDate;
       this.estimatedHours = estimatedHours;
       this.budget = budget;
       this.currentCost = currentCost;
       this.assetId = assetId;
       this.notes = notes;
       this.participants = participants;
       this.versions = versions;
       this.assets = assets;
    }
   
    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    public ProjectStatus getProjectStatus() {
        return this.projectStatus;
    }
    
    public void setProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }
    public ProjectCategory getProjectCategory() {
        return this.projectCategory;
    }
    
    public void setProjectCategory(ProjectCategory projectCategory) {
        this.projectCategory = projectCategory;
    }
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Priority getPriority() {
        return this.priority;
    }
    
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectDescription() {
        return this.projectDescription;
    }
    
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public int getEstimatedHours() {
        return this.estimatedHours;
    }
    
    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }
    public Double getBudget() {
        return this.budget;
    }
    
    public void setBudget(Double budget) {
        this.budget = budget;
    }
    public Double getCurrentCost() {
        return this.currentCost;
    }
    
    public void setCurrentCost(Double currentCost) {
        this.currentCost = currentCost;
    }
    public int getAssetId() {
        return this.assetId;
    }
    
    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }
    public Set<Note> getNotes() {
        return this.notes;
    }
    
    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }
    public Set<Participant> getParticipants() {
        return this.participants;
    }
    
    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }
    public Set<Version> getVersions() {
        return this.versions;
    }
    
    public void setVersions(Set<Version> versions) {
        this.versions = versions;
    }
    public Set<Asset> getAssets() {
        return this.assets;
    }
    
    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }




}


