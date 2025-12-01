package com.method;

public class ParaPracticeMain {
	 public static void main(String[] args) {

	        ParaPractice pm = new ParaPractice();

	        System.out.println("=== Parameterized Methods Output ===");
	        System.out.println("Square of 6 = " + pm.square(6));
	        System.out.println("Cube of 4 = " + pm.cube(4));
	        System.out.println("Sum of 10, 20 = " + pm.sum(10, 20));
	        System.out.println("Greatest among 10, 25, 15 = " + pm.greatest(10, 25, 15));
	        System.out.println("Is 12 even? " + pm.isEven(12));
	        System.out.println("Factorial of 5 = " + pm.factorial(5));
	        System.out.println("Reverse of 1234 = " + pm.reverse(1234));
	        System.out.println("Is 17 prime? " + pm.isPrime(17));
	        System.out.println("Digit count in 98765 = " + pm.countDigits(98765));
	    }
}
