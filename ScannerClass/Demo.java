package com.scanner1;
import java.util.*;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc. next();
		System.out.println("Your name is: " +name);
		
		sc.nextLine();
		System.out.println("Enter your Full name:");
		String s = sc.nextLine();
		System.out.println("Your full name is " +s);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Age is: " +age);
		
		System.out.println("Enter your marks: ");
		byte marks = sc.nextByte();
		System.out.println("marks: " +marks);
		
		
		
		
		sc.close();
	}

}
