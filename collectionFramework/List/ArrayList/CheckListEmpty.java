package com.tka;
import java.util.*;


public class CheckListEmpty {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		if (list.isEmpty()) {
			System.out.println("List is empty");
		} else {
			System.out.println("List is not empty");
		}

		// Add element
		list.add("Java");

		if (list.isEmpty()) {
			System.out.println("List is empty");
		} else {
			System.out.println("List is not empty");
		}
	}

}
