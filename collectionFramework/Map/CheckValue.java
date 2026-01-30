package com.map1;

import java.util.HashMap;
import java.util.Map;

// Check Value Exists in Map
public class CheckValue {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Java");
		map.put(2, "python");
		map.put(3, "c++");
		
		if(map.containsValue("Java")) {
			System.out.println("Value Exists");
		}
		else {
			System.out.println("Value doesnt Exists");
		}
	}
}
