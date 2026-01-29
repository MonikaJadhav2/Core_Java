package com.tka;

import java.util.ArrayList;

 // Find Size, First & Last Element
public class SizeFirstLast {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.println("List : " + list);
        System.out.println("Size of list : " + list.size());
        System.out.println("First element of list: " + list.get(0));
        System.out.println("Last element of list: " + list.get(list.size()-1));
	}
}
