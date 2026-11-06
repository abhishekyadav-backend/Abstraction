package com.kodewala.abst.pratice;

public class Account {
	public void opentAccount(String name, String address, String pan) {
		connectWithDB();

		validateNameAndAddress(name, address);
		
		validetePan(pan);
		
		createUserID();
		
		notifyUser();
		
		System.out.println("Account opend successfully");
	     return  ;
	}

	private void connectWithDB() {
		System.out.println("Connected to database");
	}

	private boolean validateNameAndAddress(String name, String address) {

		System.out.println("Validate Name:" + name);
		System.out.println("Validate Name:" + address);
		return true;
	}
	private boolean validetePan(String pan) {
		System.out.println("validete PAN:"+pan);
		return true;
	}
	private String createUserID() {
		System.out.println("Creating user ID......");
		return"USER123";
	}
	private void notifyUser() {
		System.out.println("Sending notifaction to user......");
	}
}
