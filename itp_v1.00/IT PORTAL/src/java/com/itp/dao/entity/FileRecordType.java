package com.itp.dao.entity;
// Generated Jun 17, 2011 1:34:28 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * FileRecordType generated by hbm2java
 */
public class FileRecordType  implements java.io.Serializable {


     private Integer fileRecordTypeId;
     private String fileRecordTypeIdDescription;
     private Set<FileRecord> fileRecords = new HashSet<FileRecord>(0);

    public FileRecordType() {
    }

    public FileRecordType(String fileRecordTypeIdDescription, Set<FileRecord> fileRecords) {
       this.fileRecordTypeIdDescription = fileRecordTypeIdDescription;
       this.fileRecords = fileRecords;
    }
   
    public Integer getFileRecordTypeId() {
        return this.fileRecordTypeId;
    }
    
    public void setFileRecordTypeId(Integer fileRecordTypeId) {
        this.fileRecordTypeId = fileRecordTypeId;
    }
    public String getFileRecordTypeIdDescription() {
        return this.fileRecordTypeIdDescription;
    }
    
    public void setFileRecordTypeIdDescription(String fileRecordTypeIdDescription) {
        this.fileRecordTypeIdDescription = fileRecordTypeIdDescription;
    }
    public Set<FileRecord> getFileRecords() {
        return this.fileRecords;
    }
    
    public void setFileRecords(Set<FileRecord> fileRecords) {
        this.fileRecords = fileRecords;
    }




}


