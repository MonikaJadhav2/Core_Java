package com.polymorphism.overriding;

public class PhonePay extends Bank {

	@Override
	public void payment() {
		
		System.out.println("phonepay is a child class and its a payment method");
		super.a = 23;             //accessing parent class variable 
		super.payment();          //accessing parent class method
	}
	
	public static void main(String[] args) {
		
		PhonePay p = new PhonePay();
		p.payment();
	}
}
