/*
 * DayBean.java
 *
 * Created on April 18, 2007, 10:09 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.itp.beans;

/**
 *
 * @author mansari
 */
public class DayBean {
    
    private Integer dayId;
    private String dayDescription;
    
    /** Creates a new instance of DayBean */
    public DayBean() {
    }

    public Integer getDayId() {
        return dayId;
    }

    public void setDayId(Integer dayId) {
        this.dayId = dayId;
    }

    public String getDayDescription() {
        return dayDescription;
    }

    public void setDayDescription(String dayDescription) {
        this.dayDescription = dayDescription;
    }
    
}
