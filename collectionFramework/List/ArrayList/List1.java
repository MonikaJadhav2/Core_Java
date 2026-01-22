package com.tka;

import java.util.*;

public class List1 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Anshul");
		list.add(1234);
		list.add(56.88);
		list.add(true);        //maintains insertion order
		list.add("Anshul");   //duplicate allowed
		list.add("@");
		list.add(1234999678);
		
		list.add(null);
		list.add(null);  //n no of null accepted
		list.add(null);
		
		
		System.out.println(list);
		
		System.out.println(list.size());    // get index specific
		System.out.println(list.get(0));   //maintain index
		
                                           
	}
}
