package com.pojo;
import java.util.*;

public class Student1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enetr Percentage:");
		double per = sc.nextDouble();
		
		Student1 s = new Student1(id,name,per);
		s.display();
		
		sc.close();
	}
}
