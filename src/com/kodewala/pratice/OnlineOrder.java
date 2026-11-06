package com.kodewala.pratice;

 class OnlineOrder extends Order {

	OnlineOrder(double amount) {
		super(amount);
	}

	@Override
	double calculateTotal() {
		return amount + 50; // Delivery charge
	} 
	@Override 
	void placeOrder() {
		System.out.println("Online order place successfully");
		System.out.println("Total Amount:"+calculateTotal());
	}
}
