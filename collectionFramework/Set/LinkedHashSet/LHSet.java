package com.lset;

import java.util.LinkedHashSet;

public class LHSet {

	public static void main(String[] args) {
		
//		1
		
		
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	
		set.add(1234);
		set.add(1);
		set.add(null);
		set.add(null);
		set.add(4);
		set.add(124);
		set.add(134);
		set.add(1234);   //maintains insertion order
		
		System.out.println(set);
		
	}
}

