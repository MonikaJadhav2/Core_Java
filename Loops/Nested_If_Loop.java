package com.loops;

public class Nested_If_Loop {
	 public static void main(String[] args) {
	        if (true) {
	            System.out.println("Outer if is true.");

	            if (true) {
	                System.out.println("Inner if is also true.");
	            }

	            System.out.println("This line is still inside the outer if block.");
	        }

	        System.out.println("Program ended.");
	    }

}
