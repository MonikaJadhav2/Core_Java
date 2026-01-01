package com.scanner1;
import java.util.*;

//Take a sentence from user using nextLine() and print it.
public class Sentence {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a sentence: ");
	String s = sc.nextLine();
	
	System.out.println("Your sentence: " +s);
	}
	
}
