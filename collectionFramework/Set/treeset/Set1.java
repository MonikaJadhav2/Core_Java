package com.tset;
import java.util.*;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(3456);
		set.add(34);
		set.add(34);
//		set.add(null);
		set.add(0);
		set.add(12345);
		set.add(346);
		set.add(456);
		set.add(356);       // gives sorted data
//		set.add(null);		no null accepted in treeset
		
		System.out.println(set);
	}
}
