package com.scanner1;
import java.util.*;

//Take two strings using nextLine() and print their concatenation.

public class ConcatString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Strings: ");
		String s1 = sc.nextLine();
		System.out.println();
		String s2 = sc.nextLine();
		
		System.out.println("String concatenation: " + s1.concat(s2));
		
		sc.close();
	}

}
