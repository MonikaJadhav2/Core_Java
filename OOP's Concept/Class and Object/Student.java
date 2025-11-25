package com.oops;

public class Student {

	// global variable declaration
	int age;
	String name;
	String city;
	float marks;
	boolean isPassed = true;
	char grade;

	public static void main(String[] args) {

		// object creation

		// ClassName ObjName = new ClassName();
		// heap =objects and instance variable stack= method calls, local var
		// references
		Student s = new Student();
		System.out.println(s);

		int myAge = s.age = 24;
		String myName = s.name = "Monika";
		String myCity = s.city = "Pune";
		float myMarks = s.marks = 89.20f;
		boolean myResult = s.isPassed = true;
		char myGrade = s.grade = 'A';

		System.out.println("Student Details.....!");
		System.out.println("Student Age= " + myAge);
		System.out.println("Student Name = " + myName);
		System.out.println("Student City = " + myCity);
		System.out.println("Student Marks = " + myMarks);
		System.out.println("Student Grade = " + myGrade);
		System.out.println("Student Result = " + myResult);
	}

}
