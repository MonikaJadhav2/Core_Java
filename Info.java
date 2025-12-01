package com.method;

public class Info {
	String myName() {

		return "Monika Jadhav";
	}

	String myName(String fName, String lName) {
		return fName + "  " + lName;
	}
	
	void myData(String name, int age , long mobNo , String city, String email, char gender) {
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My MobNo is " + mobNo);
		System.out.println("My City is " + city);
		System.out.println("My email is " + email);
		System.out.println("My gender is " + gender);
	}
}
