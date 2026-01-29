package com.tka;

import java.util.ArrayList;

// Copy One List to Another
public class CpoyList {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");
        
        ArrayList<String> list2 = new ArrayList<String>(list1);
        
        System.out.println("Original List; " +list1);
        System.out.println("Copied List; " +list2);
	}
}
