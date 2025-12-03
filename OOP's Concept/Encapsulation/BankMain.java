package com.encapsulation;

public class BankMain {
	public static void main(String[] args) {

		Bank b1 = new Bank();

		b1.setAccountHolder("Monika");
		b1.deposit(5000);
		b1.withdraw(1500);

		System.out.println("Name: " + b1.getAccountHolder());
		System.out.println("Available Balance: " + b1.getBalance());
	}
}
