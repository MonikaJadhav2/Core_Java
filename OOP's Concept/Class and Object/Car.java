package com.oops;

public class Car {
	String model;
	int price;
	String color;

	public static void main(String[] args) {

		// Creating an object of Car class
		Car c1 = new Car();

		c1.model = "Honda City";
		c1.price = 1500000;
		c1.color = "White";
		
		System.out.println("Model: " + c1.model);
		System.out.println("Price: " + c1.price);
		System.out.println("Color: " + c1.color);
	}
}
