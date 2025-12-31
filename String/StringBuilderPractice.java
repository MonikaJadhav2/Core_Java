package com.string1;

public class StringBuilderPractice {

	public static void main(String[] args) {
		
//		1) Create a StringBuilder with text "Hello" and append " Java".
		
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("Before appending: " +sb);
		sb.append(" Java");                           //adds at the end 
		System.out.println("Updated String: " + sb);
		System.out.println();
		
//		2) Create a StringBuilder and insert the word "Java" in the middle of a sentence.
		StringBuilder sb1 = new StringBuilder("Hello Programming");
		System.out.println("String before: " +sb1);
		int index = sb1.indexOf(" ");
		sb1.insert(index +1 , "Java");
		System.out.println("String after adding at middle: " + sb1);
		System.out.println();
		
//		3) Reverse a string using StringBuilder.
		StringBuilder sb2 = new StringBuilder("Monika");
		System.out.println("String before: " + sb2);
		sb2.reverse();
		System.out.println("String reversed: " +sb2);
		System.out.println();
		
//		4) Replace the word "Java" with "Python" using StringBuilder.
		StringBuilder sb3 = new StringBuilder("Java");
		System.out.println("String before: " +sb3);
		sb3.replace(0, 4, "Python");
		System.out.println("String replacing:" + sb3);
		System.out.println();
		
//		5) Delete characters from index 2 to 5 using StringBuilder.
		StringBuilder sb4 = new StringBuilder("HelloWorld");
		System.out.println("Before deleting: " +sb4);
		sb4.delete(2,6);
		System.out.println("After deletig:" + sb4);
		System.out.println();
		
//		6) Convert String to StringBuilder and modify it.
		String s = "Java";
		StringBuilder sb5 = new StringBuilder(s);
		System.out.println("Before modifying: " +sb5);
		sb5.append(" Programming");
		System.out.println("String modification: " + sb5);System.out.println();
		System.out.println();
		
//		7) Count the number of characters using StringBuilder (without length()).
		StringBuilder sb6 = new StringBuilder("Developer");
		int count=0;
		for(int i=0; i<sb6.length(); i++) {
//	 		System.out.println(sb6.charAt(i));
	 		count++;
	 	}
	 	System.out.println("Count of characters : " + count);
	 	System.out.println();
		
//		8) Check whether the string is palindrome using StringBuilder reverse().
		String s1 = "naman";
		StringBuilder sb7 = new StringBuilder(s1);
		String rev = sb7.reverse().toString();
		
		if (s1.equals(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
		
	}
}
