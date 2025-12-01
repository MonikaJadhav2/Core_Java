package com.method;

public class NonParaPracticeMain {
	public static void main(String[] args) {

        NonParaPractice npm = new NonParaPractice();

        System.out.println("=== Non-Parameterized Methods Output ===");
        System.out.println("Square = " + npm.square());
        System.out.println("Cube = " + npm.cube());
        System.out.println("Sum = " + npm.sum());
        System.out.println("Greatest = " + npm.greatest());
        System.out.println("Is Even? " + npm.isEven());
        System.out.println("Factorial = " + npm.factorial());
        System.out.println("Reverse = " + npm.reverse());
        System.out.println("Is Prime? " + npm.isPrime());
        System.out.println("Digit Count = " + npm.countDigits());
    }
}
