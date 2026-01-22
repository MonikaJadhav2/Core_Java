package com.tka;

import java.util.*;

public class List2 {

	public static void main(String[] args) {

//		Iterable<Integer> list = new ArrayList<Integer>();

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1234);
//		list.add('@');    use of generic restrict other than integer
//		list.add("mona");

		list.add(90);
		list.add(80);
		list.add(70);

		System.out.println(list);
		
		Collections.sort(list);    

		System.out.println(list);
	}
}
