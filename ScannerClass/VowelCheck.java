package com.scanner1;

//Take a character from user and check whether it is vowel or consonant.
import java.util.Scanner;

class VowelCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {

			System.out.println("Vowel");
		} else {

			System.out.println("Consonant");
		}
		sc.close();
	}
}
