package com.itp.beans;

public class PriorityBean {

    private Integer priorityId;
    private String priorityName;
    private String priorityDescription;
    private int priorityOrder;
    private String iconFilename;

    public Integer getPriorityId() {
        return this.priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public String getPriorityName() {
        return this.priorityName;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName;
    }

    public String getPriorityDescription() {
        return this.priorityDescription;
    }

    public void setPriorityDescription(String priorityDescription) {
        this.priorityDescription = priorityDescription;
    }

    public int getPriorityOrder() {
        return this.priorityOrder;
    }

    public void setPriorityOrder(int priorityOrder) {
        this.priorityOrder = priorityOrder;
    }

    public String getIconFilename() {
        return this.iconFilename;
    }

    public void setIconFilename(String iconFilename) {
        this.iconFilename = iconFilename;
    }
}


