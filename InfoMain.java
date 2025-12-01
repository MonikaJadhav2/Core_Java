package com.method;

public class InfoMain {
	public static void main(String[] args) {

		Info my = new Info();

		System.out.println(my.myName());

		System.out.println(my.myName("Anshul", "Gulankar"));
		
		my.myData("Mona", 25, 1234567896, "Pune", "monika@123" , 'f');
	}
}
