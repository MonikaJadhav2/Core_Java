package com.polymorphism.overriding;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		Animal a = new Cat();
		Animal a1 = new Dog();
		
		a.sound();
		a1.sound();
	}

}
