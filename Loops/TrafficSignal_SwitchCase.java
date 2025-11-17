package com.loops;

import java.util.*;

public class TrafficSignal_SwitchCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Colour:");
		String color = sc.nextLine();

		switch (color) {

		case "Red":
			System.out.println("Stop........!");
			break;

		case "Green":
			System.out.println("Go......!");
			break;

		case "Yellow":
			System.out.println("Get Ready.....!");
			break;

		default:
			System.out.println("Invalid Signal.......");
		}
	}

}
