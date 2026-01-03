package com.polymorphism.overloading;

public class LoginAPI {

	    //1>different dataTypes and
		//2>Number of parameters


//	             int getOtp() {
// 	                 return 13434;
//                }
	             int getOtp(long mobNo) {
	            	 return 12345;
	             }
	             String getOtp(String email) {
	            	 return "abcdef324578";
	             }
	             String getOtp( long mobNo , String email) {
	            	 return "Aeeef271878";
	             }
	             public static void main(String[] args) {
					LoginAPI l =new LoginAPI();
					System.out.println(l.getOtp(987654321));
				    System.out.println(	l.getOtp("monikajadhav1211@gmail.com"));
					System.out.println(l.getOtp(9373937250l, "Monikajadhav1211@gmail.com"));
				}
	             
}
