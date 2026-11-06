package com.kodewala.pratice;

public class StoreOrder extends Order {

	public StoreOrder(double amount) {
		super(amount);
	}

	@Override
	double calculateTotal() {
		return amount;
	}
    public  void placeOrder() {
    	System.out.println("Store order place successfully");
    	System.out.println("Total Amount:"+calculateTotal());
    }
}
