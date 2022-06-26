package com.example.CEVA.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("ID")
    private int ID;
    @JsonProperty("UserID")
    private int userID;
    @JsonProperty("EmployeeID")
    private String employeeID;
    @JsonProperty("SiteName")
    private String siteName;
    @JsonProperty("BusinessUnitName")
    private String businessUnitName;
    @JsonProperty("AccountName")
    private String accountName;
    @JsonProperty("GroupName")
    private String groupName;
    @JsonProperty("CategoryName")
    private String categoryName;
    @JsonProperty("TypeName")
    private String typeName;
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Duration")
    private String duration;
    @JsonProperty("isProcessed")
    private Boolean isProcessed;


    public User(int ID, int userID, String employeeID, String siteName, String businessUnitName, String accountName, String groupName, String categoryName, String typeName, String date, String duration, Boolean isProcessed) {
        this.ID = ID;
        this.userID = userID;
        this.employeeID = employeeID;
        this.siteName = siteName;
        this.businessUnitName = businessUnitName;
        this.accountName = accountName;
        this.groupName = groupName;
        this.categoryName = categoryName;
        this.typeName = typeName;
        this.date = date;
        this.duration = duration;
        this.isProcessed = isProcessed;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setProcessed(Boolean processed) {
        isProcessed = processed;
    }

    public int getID() {
        return ID;
    }

    public int getUserID() {
        return userID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getDate() {
        return date;
    }

    public String getDuration() {
        return duration;
    }

    public Boolean getProcessed() {
        return isProcessed;
    }
}
