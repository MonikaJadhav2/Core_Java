package com.tka;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("monika");
		list.add(123);
		list.add(true);
		list.add(67.68);
		list.add("@");
		
//		list.clear();
		System.out.println(list.contains("@"));
		
//		list.remove(1);
		
//		list.removeFirst();
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
		System.out.println(list.isEmpty());
		
		
		System.out.println(list.get(0));
		System.out.println(list);
				
	}
}
