package com.abstraction;

public class Gpay implements Payment {

	@Override
	public void pay(double amount) {

		double total = amount + transactionfees;

		System.out.println(total + " Gpay");

	}
}
