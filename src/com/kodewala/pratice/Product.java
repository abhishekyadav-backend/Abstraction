package com.kodewala.pratice;

abstract class Product {
 int productId;
 String productName;
 public Product(int productId, String productName) {
	super();
	this.productId = productId;
	this.productName = productName;
 }
 abstract void displayDetails();

}
 