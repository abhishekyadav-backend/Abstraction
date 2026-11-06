package com.kodewala.pratice;

abstract class Teacher extends Person { 
	@Override
  void showRole() {
	  System.out.println("Role :Teacher");
  } 
  abstract void teach();
}

