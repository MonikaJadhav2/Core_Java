package com.loops;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b :");

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter Operation :");
		char op = sc.next().charAt(0);

		switch (op) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			if (b != 0)
				System.out.println(a / b);
			else
				System.out.println("Cannot divide by zero");
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}
}
