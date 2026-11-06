package com.kodewala.pratice;

public class Dog extends Animal{
   
	void sound() {
		System.out.println("Doge barks");
	} 
	public static void main(String[]args) {
		Dog  dog = new Dog();
		dog.sound();
	}
}
