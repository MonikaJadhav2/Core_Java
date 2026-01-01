package com.scanner1;
import java.util.*;

public class AddNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value1: ");
		int a = sc.nextInt();
		
		System.out.println("Enter value2: ");
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("Addition of two numbers: " +c);
	}
}
