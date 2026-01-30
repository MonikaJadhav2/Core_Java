package com.map1;

import java.util.HashMap;
import java.util.Map;

// Check Key Exists in Map
public class CheckKey {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Java");
		map.put(2, "python");
		map.put(3, "c++");
		
		if(map.containsKey(2)) {
			System.out.println("Key exists");
		}
		else {
			System.out.println("Key doesnt exists");
		}
	}
}
