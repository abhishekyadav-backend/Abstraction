package com.kodewala.abst;

public class PlaceOrder {
	public boolean placeOrder(String productName, int quantity, String paymentMethod, String address) {

	aadItem(productName, quantity);
    viewCart();
    addAddress(address);
    proceedTocheckOut();
    makePayment(paymentMethod);
    trackOrder();
    
    return true;
    
 }
	private void proceedTocheckOut() {
		// TODO Auto-generated method stub
		
	}
	private void aadItem(String productName, int quantity) {
		System.out.println("product name:" + productName + "" + "quantity:" + quantity);
		// return true;
	}

	private void viewCart() {
		System.out.println("Add items Details");
	}

	private void addAddress(String address) {
		System.out.println("Address added successfuly" + address);
		// return true;
	}

	private void porcceedTouchekOut() {
		System.out.println("porcceedTocheckOut");
	}

	private void makePayment(String paymentMethod) {
		System.out.println("successfuly" + paymentMethod);
	}

	private void trackOrder() {
		System.out.println("trackOrder");
	}
}
