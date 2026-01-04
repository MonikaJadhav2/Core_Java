package com.abstraction;

public abstract class Login {                                        
	//abstract class contain :
	//abstract method
	//non abstract method
	//constructors
	//instance variables

	abstract void myAuthenticate(String userName, String password);  //abstract method 

	void myAppName() {                                              // non-abstract method
		System.out.println("My Application Swiggy ...!");
		System.out.println();
	}

}
