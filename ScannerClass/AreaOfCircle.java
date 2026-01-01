package com.scanner1;
import java.util.*;

//Take radius from user and calculate area of circle.
public class AreaOfCircle {
	
	void area(float r) {
		
		float a = r * r;
		System.out.println("Area of circle= " +a);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of circle: ");
		float radius = sc.nextFloat();
		
		AreaOfCircle a = new AreaOfCircle();
		a.area(radius);
	}

}
