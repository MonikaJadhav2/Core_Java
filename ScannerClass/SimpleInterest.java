package com.scanner1;

import java.util.*;

//Take principal, rate, time and calculate Simple Interest (SI = PRT/100)

public class SimpleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter principle: ");
		float p = sc.nextFloat();

		System.out.println("Enter rate: ");
		float r = sc.nextFloat();

		System.out.println("Enter time: ");
		float t = sc.nextFloat();
		
		float SI = (p*r*t)/100;
		System.out.println("Simple interest : " + SI);
	}
}
