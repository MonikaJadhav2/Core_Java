package com.tka;

import java.util.ArrayList;

// Check if Element Exists in List
public class CheckElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		int search =200;
		
		if(list.contains(search)) {
			System.out.println(search + " contains in list");
		}
		else {
			System.out.println(search + " doesnt contain in list");
		}
	}
}
