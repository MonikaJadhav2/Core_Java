package com.demo;

public class Bitwise_Shift_Operator {
	    public static void main(String[] args) {
	        int a = 8;   // binary: 0000 1000

	        System.out.println("a << 1 = " + (a << 1));  // Left shift by 1
	        System.out.println("a << 2 = " + (a << 2));  // Left shift by 2
	        System.out.println("a >> 1 = " + (a >> 1));  // Right shift by 1
	        System.out.println("a >> 5 = " + (a >> 5));  // Right shift by 2
	        System.out.println();
	        

	        int b = -8;  // binary (two’s complement)
	        System.out.println("b >> 1 = " + (b >> 1));  // Signed right shift
	        System.out.println("b >>> 1 = " + (b >>> 1)); // Unsigned right shift
	    
	    }

}
