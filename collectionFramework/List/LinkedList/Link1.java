package com.linklist;
import java.util.*;

public class Link1 {

	public static void main(String[] args) {
		
//		its fastest among three of list
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1234);
		list.add(1234);
		list.add(1234);
		list.add(234);
		list.add(1234);
		list.add(134);
		list.add(1);
		list.add(34);
		
		System.out.println(list);      //grt like array
//		System.out.println(list.get(0));
		
//		foreach loop 
//		iterate one by one 
		
		for (Integer w : list) {     //fetch one by one
			System.out.println(w);
			System.out.println();
//			System.out.println(w/2);
			
		}
	}
}
