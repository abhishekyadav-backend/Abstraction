package com.kodewala.pratice;

public class Account {
  private int balance;
  
  public void credit() {
	  
	  checkBalance(); 
	   
	  validatePin("tigh545");
	  
	  System.out.println("Account.credit().....doing fund transfer");
  } 
  
	private int  checkBalance() {
		System.out.println("Account.checkBalance()");
		return 2000;
	}
	private boolean validatePin(String userId) {
		System.out.println("Account.validataPin()......");
		return true;
	}
}

