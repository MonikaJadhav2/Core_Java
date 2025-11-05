package com.demo;

public class AssignmentOperator {
	public static void main(String[] args) {
		    int a = 10;
	        int b = 5;

	        a += b;  // a = a + b → 15
	        System.out.println("a += b : " + a);

	        a -= b;  // a = a - b → 10
	        System.out.println("a -= b : " + a);

	        a *= b;  // a = a * b → 50
	        System.out.println("a *= b : " + a);

	        a /= b;  // a = a / b → 10
	        System.out.println("a /= b : " + a);

	        a %= b;  // a = a % b → 0
	        System.out.println("a %= b : " + a);
	    }

}
