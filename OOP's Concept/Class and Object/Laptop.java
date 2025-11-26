package com.oops;

public class Laptop {
	String brand;
	int ram;

	public static void main(String[] args) {

		// Creating an object of Laptop class
		Laptop l1 = new Laptop();

		// Assigning values to object variables
		l1.brand = "Dell";
		l1.ram = 16;

		// Printing values
		System.out.println("Brand: " + l1.brand);
		System.out.println("RAM: " + l1.ram + " GB");
	}
}
