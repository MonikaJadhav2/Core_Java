package com.scanner1;

//Take three sides of triangle and print its perimeter.

import java.util.Scanner;

class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three sides of triangle:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("Perimeter = " + (a + b + c));
		sc.close();
	}
}
