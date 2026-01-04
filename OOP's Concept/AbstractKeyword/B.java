package com.abstraction;

public class B extends A{
	
	B() {
		super("rahul");
	}

	@Override
	public void m1() {
		System.out.println("abstract method of class A");
	}
}
