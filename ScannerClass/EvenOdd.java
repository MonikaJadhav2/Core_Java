package com.scanner1;

//Take a number and check if it is even or odd.
import java.util.Scanner;

class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		if (n % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");

		sc.close();
	}
}
