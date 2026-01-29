package com.tka;

import java.util.ArrayList;

// Iterate Using For-Each Loop
public class IterateList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("python");
		list.add("c++");
		
		System.out.println(list);
		
		System.out.println("Iterating over each element:");
		for (String str : list) {
			System.out.println(str);
		}
		
	}
}
