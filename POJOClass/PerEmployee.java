package com.pojo;

public class PerEmployee extends Person {

	double salary;

	public PerEmployee(String name, int age, double salary) {
		super(name,age);
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Salary: " +salary);
	}
	
	
}
