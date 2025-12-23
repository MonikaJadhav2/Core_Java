package com.finaltopic;

public class Salary {
	final double salary = 234567345;

	public void m1(int a) {

		System.out.println(a);
		System.out.println("m1 method of demo class");
		double tSalary = salary + 4500;
		System.out.println(tSalary);
	}

	public final void Display() {
		System.out.println("Inside a dispaly method of parent class");

	}

}
