package com.kodewala.pratice;

public class WashingnMachine extends Appliance {
	void turnOn() {
		System.out.println(" Washing machine is turn ON");
	}
	void turnOff() {
		System.out.println(" Washing machine is turn Off");
	} 
	
	
	public static void main(String[] args) {
		WashingnMachine washingnMachine = new WashingnMachine();
		washingnMachine.turnOn();
		washingnMachine.turnOff();
	}
}
