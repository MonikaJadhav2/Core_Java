package com.constructor;

public class Employee {
	int empId;
	String name;
	String salary;
	String city;

	/*
	 * void m1(int id, String n ){ this.empId = id; this.name = n;
	 * System.out.println(empId); System.out.println(name); }
	 */

	Employee() {
		empId = 10;
		name = "Monika";
		System.out.println("Inside non-parameterized Constructor");
	}
	
	Employee(int a){
		System.out.println("Inside parameterized constructor");
	}
	
	Employee(int Id, String name, String salary, String  city){
		System.out.println("Inside 2 parameterized constructor");
		this.empId = Id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.display();
	}
	
	void display() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(city);
	}

}
