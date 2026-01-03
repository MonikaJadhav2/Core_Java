package com.polymorphism.overloading;

public class Addition {
	
	public void sum(int a, int b) {
		System.out.println("sum of int variables: " + a+b);
	}
	
	public void sum(float a, float b) {
		System.out.println("sum of float variables: " + a+b);
	}


	public static void main(String[] args) {
		
		Addition a = new Addition();
		
		a.sum(2, 5);
		a.sum(12.4f, 8.9f);
	}
}
