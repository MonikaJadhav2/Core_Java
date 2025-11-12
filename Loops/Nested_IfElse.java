package com.loops;

public class Nested_IfElse {
	public static void main(String[] args) {
		if(true) {
			System.out.println("outer if is true.");
			if(false) {
				System.out.println("Inner if is true.");
			}
			else {
				System.out.println("inner else block executed.");
			}
		}
		else {
			System.out.println("Outer else block executed.");
		}
	}

}
