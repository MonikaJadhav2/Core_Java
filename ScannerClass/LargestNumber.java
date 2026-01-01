package com.scanner1;
import java.util.*;

//Take three numbers and print the largest number.
public class LargestNumber {
	
	void greater(int a, int b, int c) {
		
		if(a>b && a>c) {
			System.out.println("a is greter");
		}
		else if(b>a && b>c){
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		
		LargestNumber obj = new LargestNumber();
		obj.greater(a, b, c);
		
	}

}
