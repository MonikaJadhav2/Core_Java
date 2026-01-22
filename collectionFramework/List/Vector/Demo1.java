package com.vector1;
import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		
//		it has same functionality as of ArrayList
		//slow than ArrayList cause of synchronization
		//its a legacy class
		
		Vector<String> v = new Vector<String>();
		
		v.add("java");
		v.add("java");
		v.add("python");
		v.add("java");
		v.add("c++");
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		
		
	}
}
