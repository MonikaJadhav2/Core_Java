package com.pojo;

public class MainClass {

	public static void main(String[] args) {
		
		College c = new College(1,"ACEM");
		Student s = new Student(123, "Anshu", "pune", c);
		
		System.out.println(s);
	}
}
