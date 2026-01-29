package com.hset;

import java.util.HashSet;
import java.util.Set;

// Create HashSet & Add 5 Strings
public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Grapes");
        
        System.out.println("Set elements: " +set);
        
	}
}
