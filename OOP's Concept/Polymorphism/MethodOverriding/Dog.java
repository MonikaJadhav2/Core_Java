package com.polymorphism.overriding;

public class Dog extends Animal{

	@Override
	public void sound() {
		
		System.out.println("This is child class Dogs method");
		System.out.println("Dog barks......!");
		System.out.println();
		
	}
}
