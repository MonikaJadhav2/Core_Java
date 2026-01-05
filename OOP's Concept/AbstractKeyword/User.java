package com.abstraction;

public class User extends Login{

	@Override
	void myAuthenticate(String username, String password) {

		if (username == "mahi123@gmail.com" && password == "mahi@123") {
			System.out.println("User Login Successfully ");
		} 
		
		else {
			System.out.println("Invalid Credentials ... ! ");
		}

	}
}

