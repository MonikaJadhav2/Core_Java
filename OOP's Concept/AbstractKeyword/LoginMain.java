package com.abstraction;

public class LoginMain {

	public static void main(String[] args) {
		
	
	Login l ;
	
	l = new Admin();
	l.myAppName();
	l.myAuthenticate("monika123@gmail.com", "monika@123");
	
	
	l = new User();
	l.myAppName();
	l.myAuthenticate("mahi123@gmail.com", "mahi@123");
}

}
