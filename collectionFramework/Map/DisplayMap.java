package com.map1;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

// Display Map Using entrySet()
public class DisplayMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			
			System.out.println("Key : " + entry.getKey() + "   Value : " + entry.getValue());
		}
		
	}
}
