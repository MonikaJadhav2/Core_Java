package com.inheritance;

public class AnimalMain extends Dog {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat(); // inherited method
		d.bark();
	}
}
