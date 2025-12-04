package com.constructor;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new Employee();
//	System.out.println("FIRST METHOD CALL");
//    e.m1(1,"Mona");
		
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(11, "Mona", "5LPA", "Pune");
	
	}
}
