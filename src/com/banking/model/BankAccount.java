 package com.banking.model;

public class BankAccount {
	private String accNo;
	private String accType;
	private double bal;
	private boolean isActive = true; 
	
     public BankAccount(String accNo , String accType , double bal){
    	 this.accNo = accNo;
    	 this.accType = accType;
    	 this.bal = bal;
     }
     
     public double getBal() {
    	 return bal;
     }
	
     
     
}
