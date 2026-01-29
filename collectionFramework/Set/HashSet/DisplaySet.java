package com.hset;
import java.util.*;

public class DisplaySet {

	
	 public static void main(String[] args) {

	        Set<String> set = new HashSet<>();
	        set.add("Red");
	        set.add("Green");
	        set.add("Blue");

	        for (String color : set) {
	            System.out.println(color);
	        }
	    }
}
