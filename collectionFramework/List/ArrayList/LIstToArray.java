package com.tka;

import java.util.ArrayList;

// Convert List to Array & Print
public class LIstToArray {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Red");
		list.add("Green");
		list.add("Blue");
		System.out.println(list);
		
		String[] arr = list.toArray(new String[0]);
		
		System.out.println("Array elements: ");
		for (String str : arr) {
			System.out.println(str);
		}
	}
}
