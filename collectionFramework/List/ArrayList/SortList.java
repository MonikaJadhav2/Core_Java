package com.tka;

import java.util.ArrayList;
import java.util.Collections;

// Sort List in Ascending Order
public class SortList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);
        
        Collections.sort(list);
        System.out.println("Sorted list: " +list);
	}
}
