package com.itp.beans;

import org.apache.struts.validator.ValidatorForm;

public class ListProjectBean extends ValidatorForm {

    public static final int BACK_NAVIGATION = 0;
    public static final int FORWARD_NAVIGATION = 1;
    private String searchString = "";
    private int orderBy = 0;
    private int order = 0;
    private boolean newSearch = false;
    private int navigationAction = 1;
    private int maxResults = 10;
    private int beginIndex = 0;
    private int endIndex = 10;
    private int totalResults;
    private ProjectBean[] projects = null;

    public ListProjectBean() {
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ProjectBean[] getProjects() {
        return projects;
    }

    public void setProjects(ProjectBean[] projects) {
        this.projects = projects;
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public int getNavigationAction() {
        return navigationAction;
    }

    public void setNavigationAction(int navigationAction) {
        this.navigationAction = navigationAction;
    }

    public boolean isNewSearch() {
        return newSearch;
    }

    public void setNewSearch(boolean newSearch) {
        this.newSearch = newSearch;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(int orderBy) {
        this.orderBy = orderBy;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
