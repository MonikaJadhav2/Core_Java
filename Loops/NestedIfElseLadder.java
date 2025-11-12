package com.loops;

public class NestedIfElseLadder {
	public static void main(String[] args) {
		if(true) {
			System.out.println("Outer if is true.");
			if(false) {
				System.out.println("Inner if condition 1 is true.");
			}
			else if(true) {
				System.out.println("Inner else-if condition is true.");
			}
			else {
				System.out.println("Inner else block exected.");
			}
		}
		else {
			System.out.println("Outer else block exected.");
		}
	}

}
