package com.tka;

public class Even {

	public static void main(String[] args) {

		int num[][] = { { 10, 21, 33, 45, 67, 77, 78, 30 }, { 40, 50, 61, 60 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {

				if (num[i][j] % 2 == 0) {
					System.out.println("Even element: " +num [i][j]);
					
				}
			}
		}

	}
}
