package com.hset;
import java.util.*;


public class CheckSetElement {

	
	public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        if (set.contains("Python")) {
            System.out.println("Python exists in the Set");
        } else {
            System.out.println("Python does not exist in the Set");
        }
    }
}
