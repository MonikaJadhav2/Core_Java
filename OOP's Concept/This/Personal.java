package com.this1;

public class Personal {
	String firstName;
	String lastName;
	int age;
	long mobileNo;
	String email;
	String city;
	String state;
	String country;
	String gender;
	String education;

	void PersonalInfo(String firstName, String lastName, int age, long mobileNo, String email, String city,
			String state, String country, String gender, String education) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mobileNo = mobileNo;
		this.email = email;
		this.city = city;
		this.state = state;
		this.country = country;
		this.gender = gender;
		this.education = education;
	}

	void displayInfo() {
		System.out.println("----- Personal Information -----");
		System.out.println("First Name : " + this.firstName);
		System.out.println("Last Name  : " + this.lastName);
		System.out.println("Age        : " + this.age);
		System.out.println("Mobile No  : " + this.mobileNo);
		System.out.println("Email      : " + this.email);
		System.out.println("City       : " + this.city);
		System.out.println("State      : " + this.state);
		System.out.println("Country    : " + this.country);
		System.out.println("Gender     : " + this.gender);
		System.out.println("Education  : " + this.education);
	}
}
