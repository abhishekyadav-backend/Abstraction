package com.kodewala.pratice;

public class TestOrder {
 
	public static void main(String[] args) { 
		
	  Order order1 = new OnlineOrder(1000); 
	  Order order2 = new StoreOrder(1000);
	  
	  order1.placeOrder();
	  System.out.println("---------");
	  order2.placeOrder();
	
	}
}
