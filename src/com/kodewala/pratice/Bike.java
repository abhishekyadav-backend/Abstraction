package com.kodewala.pratice;

public class Bike extends Vehicle {
  void start() {
	  System.out.println("Bike start with self start");
  }

 public static void main(String []args) {
	 Bike bike = new Bike();
	 bike.start();
	 bike.fuleType();
 }
}