package com.polymorphism.overriding;

public class GooglePay extends Payment {

	public void reward() {
		System.out.println("Gpay: Get reward on the gpay");
	}

	public void checkBalance() {
		System.out.println("Gpay : Check your balance ");
	}
}
