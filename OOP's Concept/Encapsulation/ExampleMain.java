package com.encapsulation;

public class ExampleMain {

	public static void main(String[] args) {
		Example e = new Example();
		e.setRollNo(121);
		System.out.println("Roll No = " + e.getRollNo());

		e.setName("Monika");
		System.out.println( "Name = " +e.getName());
		
		e.setAge(26);
		System.out.println("Age = "+ e.getAge());
		
		e.setCity("pune");
		System.out.println("City = " + e.getCity());
		
	}
}
