package com.hset;

import java.util.*;

public class Hash1 {

	public static void main(String[] args) {

		HashSet set = new HashSet();

		set.add(123);          //don't maintain insertion order
		set.add("mona");
		set.add('s');
		set.add(12.66);
		set.add(1235678961);
		set.add(123);
		set.add("anshul");      
		set.add(true);
		set.add(true);        //no duplicates allowed
		
		set.add(null);        //one null allowed
		set.add(null);
		
		System.out.println(set);
//		System.out.println(set.get(0));  //no index access or random access		
	}
}
