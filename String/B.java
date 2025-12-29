package com.string1;

public class B {
	public static void main(String[] args) {

		String s1 = "java";
		String s4 = "Java";
		String s5 = "java";
		String s2 = s1;
		String s3 = "Python";

		System.out.println(s4.equals(s5)); // false -> case-sensitive value check
		System.out.println(s1.equals(s2)); // true -> same value
		System.out.println(s1.equals(s3)); // false -> different values
	}
}
