package com.polymorphism.overloading;

public class Area {

	public void area(double length, double width ) {
		
		System.out.println("Area of rectangle : " + (length*width));
	}
	
	public void area(double r) {
		
		System.out.println("Area of circle: " + (3.14*r*r));
	}
	
	public static void main(String[] args) {
		
		Area a = new Area();
		a.area(7);
		a.area(4.5, 7.8);
	}
}
