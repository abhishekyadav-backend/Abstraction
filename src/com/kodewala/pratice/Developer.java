package com.kodewala.pratice;



public class Developer extends Employee {

	public Developer(String name) {
		super(name);
	}
   @Override
   void displayDetails() {
	   System.out.println("Employee Name:"+name);
	   System.out.println("Role:Java Developer");
   } 
   public static void main(String[] args) {
	 Developer developer = new Developer("Abhishek");
	 
	 developer.displayDetails();
}
}
 