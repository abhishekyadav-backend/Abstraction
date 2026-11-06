package com.kodewala.pratice;

abstract class Order { 
	double amount;

	public Order(double amount) {
		super();
		this.amount = amount;
	}
	abstract  double calculateTotal();
	abstract void placeOrder();

}
