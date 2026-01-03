package com.polymorphism.overriding;

public class BankMain {
	
	public static void main(String[] args) {
		
		Bank b1 = new PhonePay();
		Bank b2 = new Gpay();
		
		b1.payment();
		b2.payment();
	}

}
