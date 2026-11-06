package com.kodewala.pratice;

public class UPIPayment extends Payment {
@Override 
void pay() {
	System.out.println("Payament done done using UPI");
} 
 public static void main(String[] args) {
	Payment  payment = new UPIPayment();
	payment.pay();
}
}
