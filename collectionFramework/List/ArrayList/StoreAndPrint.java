package com.tka;
import java.util.*;
import java.util.ArrayList;

// Store 5 Integers in ArrayList & Print All Elements
public class StoreAndPrint {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Elements in array list :" ) ;
		
		for (Integer e : list) {
			System.out.println(e);
		}
	}
}
