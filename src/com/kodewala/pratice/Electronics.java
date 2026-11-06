package com.kodewala.pratice;

public class Electronics  extends Product{

	public Electronics(int productId, String productName) {
		super(productId, productName);
	}

	void displayDetails() {
		System.out.println("Product ID:"+productId);
		System.out.println("Product Name:"+productName);
	} 
	public static void main(String[] args) {
		Electronics electronics  = new Electronics(101,"Laptop");
		electronics.displayDetails();
	}
}
