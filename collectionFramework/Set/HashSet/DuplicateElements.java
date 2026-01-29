package com.hset;

import java.util.*;

// Add Duplicate Elements in Set

public class DuplicateElements {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Apple");
		set.add("Banana");
		set.add("Mango");

		System.out.println("Original Set: " + set);

		// Try adding duplicates
		set.add("Apple");
		set.add("Banana");

		System.out.println("After Adding Duplicates: " + set);
	}
}
