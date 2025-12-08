package com.inheritance;

public class User {
	public static void main(String[] args) {

		System.out.println("Instagram User----!");
		Instagram i = new Instagram();
		i.myLogin();
		i.myMsg();
		i.myRegister();
		i.myStory();
		i.myReels();

		System.out.println("*************************");
		System.out.println("Whatsapp User --------!");
		Whatsapp w = new Whatsapp();
		w.myRegister();
		w.myLogin();
		w.myMsg();
		w.myStatus();
		w.myLocation();

		System.out.println("*************************");
		System.out.println("Facebook User --------!");
		Facebook f = new Facebook();
		f.myRegister();
		f.myLogin();
		f.myMsg();
		f.myPost();

	}
}
