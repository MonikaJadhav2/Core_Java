package com.map1;

import java.util.HashMap;
import java.util.Map;

// Retrieve Value Using Key
public class Getvalue {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(101, "Monika");
		map.put(102, "Anshul");
		map.put(103, "Mahesh");
		
		System.out.println("Value of key 102 is: " + map.get(102));

	}
}
