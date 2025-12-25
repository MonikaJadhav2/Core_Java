package com.pojo;

import java.util.*;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculator c = new Calculator();
		
		System.out.println("Add two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result: " + c.add(a, b));

        System.out.println("Add three integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Result: " + c.add(x, y, z));

        System.out.println("Add two doubles:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Result: " + c.add(d1, d2));

        
        sc.close();
	}
}
