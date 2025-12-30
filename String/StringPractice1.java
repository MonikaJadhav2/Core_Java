package com.string1;

public class StringPractice1 {

	public static void main(String[] args) {
		
//		1. substring():Extracts part of string.
		String s = "FullStack";
		System.out.println(s.substring(4));
		System.out.println(s.substring(0, 4));
		
//		2. replace():
		String s1 = "Java";
		System.out.println(s.replace('a', 'o'));
		
//		3. startsWith() & endsWith():
		String s3 = "JavaDeveloper";
		System.out.println(s.startsWith("Java"));
		System.out.println(s.endsWith("er"));
		
//		4. Adds one string to another:
		String s4 = "Java";
		System.out.println(s.concat(" Developer"));
		
		
	}
}
