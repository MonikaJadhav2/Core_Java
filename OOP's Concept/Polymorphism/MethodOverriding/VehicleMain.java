package com.polymorphism.overriding;

public class VehicleMain {
	
	public static void main(String[] args) {
		
		Vehicle v2 = new Vehicle();
		v2.speed();
		
		Vehicle v = new Bike();
		Vehicle v1 = new Car();
		
		v.speed();
		v1.speed();
	}

}
