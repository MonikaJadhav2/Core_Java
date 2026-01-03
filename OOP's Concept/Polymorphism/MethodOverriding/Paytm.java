package com.polymorphism.overriding;

public class Paytm extends Payment {

	public void reward() {
		System.out.println("Paytm : Get cashback of 5 rupppes on the merchant payment");
	}

	public void checkBalance() {
		System.out.println("Paytm : Check your account balance");
	}
}
