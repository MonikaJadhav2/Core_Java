package com.polymorphism.overriding;

public class Cat extends Animal {

	@Override
	public void sound() {
	
		System.out.println("This is child class Cats method");
		System.out.println("Cat meows......");
		System.out.println();
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();

		Cat c = new Cat();
		c.sound();
		
	}
}
