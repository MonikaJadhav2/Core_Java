package com.abstraction;

public class Admin extends Login {

	@Override
	void myAuthenticate(String username, String password) {

		if (username == "monika123@gmail.com" && password == "monika@123") {
			System.out.println("Admin Login Successfully ");
		} 
		
		else {
			System.out.println("Invalid Credentials ... ! ");
		}

	}
}
