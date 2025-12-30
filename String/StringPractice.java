package com.string1;

public class StringPractice {

	public static void main(String[] args) {

//	length():Returns number of characters in the string.

		String s = " Java";
		System.out.println("String Length : " + s.length());

//   length of an empty string
		String s1 = "";
		System.out.println(s1.length());

//   Print each character of a string using charAt().
		System.out.println("char : " + s.charAt(2));

//	Convert a string to uppercase.
		System.out.println("Uppercase " + s.toUpperCase());

//	Convert a string to lowercase.
		System.out.println("LowerCase : " + s.toLowerCase());

//	Remove leading and trailing spaces from a string.
		System.out.println("Trailing leading spaces removal : " + s.trim());

//	Check whether a string is empty or not.
		System.out.println("String Empty : " + s.isEmpty());

//	Check whether a string contains a given word.
		System.out.println(s.contains(s1));

//	Compare two strings using equals() and equalsIgnoreCase() and ==.
		String s2 = "monika";
		String s3 = "Monika";
		String s6 = new String("Java");

		System.out.println("String == : " + (s == s6));
		System.out.println("String equals : " + s1.equals(s2));
		System.out.println("String equals by Ignore case : " + s1.equalsIgnoreCase(s2));

//	Find the first occurrence of a character in a string.
		String s4 = "Gulankar";
		char ch = 'a';
		int index = s.indexOf(ch);

		if (index != -1) {
			System.out.println("First occurece of " + ch + " is at index : " + index);
		} else {
			System.out.println("Character not found");
		}

//	Find the last occurrence of a character.
		String s5 = "Gulankar";
		String word = "Java";

		int index1 = s.lastIndexOf(word);

		System.out.println("Last ocuurence of " + word + " is at index :" + index1);

	}
}
