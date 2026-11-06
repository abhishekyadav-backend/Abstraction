package com.kodewala.pratice;

abstract class Employee {
 String name;

 public Employee(String name) {
	super();
	this.name = name;
 }
  abstract void displayDetails();
}
