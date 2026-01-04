package com.abstraction;

public class MainPayment {

	public static void main(String[] args) {
		
		Payment p;
		
		p= new Gpay();
		p.pay(344);
		
		p = new Phonepe();
		p.pay(399);
	}
}
