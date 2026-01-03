package com.polymorphism.overriding;

public class Car extends Vehicle {
	
	@Override
	public void speed() {
		System.out.println("Car speed is 120 km/h");
	}
}
