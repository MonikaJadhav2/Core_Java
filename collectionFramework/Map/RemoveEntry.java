package com.map1;

import java.util.HashMap;
import java.util.Map;

// Remove Entry Using Key
public class RemoveEntry {

	public static void main(String[] args) {
		
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		System.out.println("Map before removal: " +map);
		map.remove(1);
		
		System.out.println("Map after removal: " +map);
	}
}
