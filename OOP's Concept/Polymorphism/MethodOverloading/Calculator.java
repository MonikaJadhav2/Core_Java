package com.polymorphism.overloading;

public class Calculator {

	void myAddition(int a, int b) {
		System.out.println(a + b);
	}

	void myAddition(float a, float b) {
		System.out.println(a + b);
	}

	void myAddition(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.myAddition(4, 7);
		c.myAddition(12.00f, 13.00f);
		c.myAddition(22.00, 33.00);
	}

}
