package com.tka;

import java.util.*;

public class ArrayInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// size input
		System.out.println("Enter array size: ");
		int size = sc.nextInt();

		// creaye array
		int arr[] = new int[size];

		// input values
		System.out.println("Enter " + size + " values: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//display values
		System.out.println("Array elements: ");
		for(int i= 0; i<size; i++) {
			System.out.println(arr[i] + " ");
		}
		
		sc.close();
	}
}
