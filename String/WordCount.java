package com.string1;

// counts word in a sentence
public class WordCount {
	
	public static void main(String[] args) {
		
		String s = "Java is very easy language";
		String words[] = s.split(" ");
		
		System.out.println("Word count = " + words.length);
	}

}
