package com.Campus.Campus.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class SchoolForm {

    @NotNull
    private Integer userId;
    @NotNull
    private String schoolName;
    @NotNull
    private String place;
    @NotNull
    private String address;
    @NotNull
    private String contact;
    @Email
    private String email;
    private String principal;

    
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPrincipal() {
        return principal;
    }
    public void setPrincipal(String principal) {
        this.principal = principal;
    }
    
    
    
}
