package com.tka;

import java.util.ArrayList;
import java.util.Collections;

// Reverse Elements of a List
public class ReverseList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);

		Collections.reverse(list);
		System.out.println("Reversed list: " + list);
	}
}
