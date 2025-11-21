package com.loops;

public class LeftAgleTrianglePatternPrinting {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			// spaces
			for (int s = n - i; s >= 1; s--) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
