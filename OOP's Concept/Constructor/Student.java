package com.constructor;

public class Student {
	String name;
	int age;
	
	Student(){
		System.out.println("Inside first constructor");
		name = "Monika";
		age = 30;
		this.display();
	}
	
	Student(String n , int a){
		System.out.println("Inside second constructor");
		name = n;
		age = a;
		this.display();
	}
	
	void display() {
		System.out.println("Name = " + name );
		System.out.println("Age = " + age);
	}
}
