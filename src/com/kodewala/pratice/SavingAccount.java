package com.kodewala.pratice;

public class SavingAccount extends BankAccount {
 void deposite() {
	 System.out.println("Your Deposite amount is successful  ");
 } 
 void withdraw() {
	 System.out.println("Your withdraw amount is successful");
 } 
 public static void main(String[] args) {
	
	 SavingAccount savingAccount = new SavingAccount();
	 
	 savingAccount.deposite();
	 savingAccount.withdraw();
}
}
