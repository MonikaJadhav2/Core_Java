package com.map1;
import java.util.*;

// Find Size of Map
public class MapSize {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);
        
        System.out.println("Map size: " + map.size());
        
	}
}
