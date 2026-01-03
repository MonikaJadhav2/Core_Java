package com.polymorphism.overriding;

public class Gpay extends Bank{
	
	@Override
	public void payment(){
		
		System.out.println("Payment method from child class");
	}
	
	
	public static void main(String[] args) {
		
		Gpay g = new Gpay();
		g.payment();
	}

}
