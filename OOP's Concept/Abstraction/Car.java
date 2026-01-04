package com.abstraction;

public class Car extends Vehicle {

	Car() {
		System.out.println("Car constructor");
	}

	void start() {
		System.out.println("Car started");
	}
	
	public static void main(String[] args) {
		
		Vehicle v ;
		
		v = new Car();
		v.start();
	}
}
