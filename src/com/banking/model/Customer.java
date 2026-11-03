package com.banking.model;

public class Customer {

    private String name;
    private String mobileNo;
    private String email;
    private String address;

    public Customer(String name, String mobileNo, String email, String address) {

        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
        this.address = address;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setMobileNo(String mobileNo) {
    	this.mobileNo = mobileNo;
    }
    
    public String getMobileNo() {
    	return mobileNo;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    
    public String getEmail() {
    	return email;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
    public String getAddress() {
    	return  address;
    }

}