package com.string1;

public class CountVowels {

	public static void main(String[] args) {
		
		String s = "Java Full Stack";
		s = s.toLowerCase();
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch =='a'|| ch =='e' || ch =='i' || ch=='o' || ch=='u') {
				count ++;
				System.out.println("vowel is at index " + i);
			}
		}
		
		System.out.println("Count of vowels in string is: " + count);
	}
}
