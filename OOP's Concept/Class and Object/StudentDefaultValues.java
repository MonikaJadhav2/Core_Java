package com.oops;

public class StudentDefaultValues {

	// global variable declaration
	int age;
	String name;
	String city;
	float marks;
	boolean isPassed = true;
	char grade;
	
	public static void main(String[] args) {
		StudentDefaultValues s = new StudentDefaultValues();
		
		System.out.println("Student Details.....!");
		System.out.println("Student Age= " + s.age);
		System.out.println("Student Name = " + s.name);
		System.out.println("Student City = " + s.city);
		System.out.println("Student Marks = " + s.marks);
		System.out.println("Student Grade = " + s.grade);
		System.out.println("Student Result = " + s.isPassed);
	}
}
