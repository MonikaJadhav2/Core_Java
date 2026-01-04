package com.abstraction;

public class Phonepe implements Payment {

	public void pay(double amount) {
		
		double total = amount + transactionfees;
		System.out.println(total + " Phonepe");
	}
}
