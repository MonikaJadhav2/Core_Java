package com.hset;
import java.util.*;

public class RemoveFromSet {

	
	public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        System.out.println("Original set :" + set);

        set.remove("Banana");

        System.out.println("Set after removal: " + set);
    }
}
