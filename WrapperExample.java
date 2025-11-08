package com.demo;

public class WrapperExample {
	    public static void main(String[] args) {
	        int a = 10;               // primitive type
	        Integer obj = Integer.valueOf(a); // boxing (manual)
	        int b = obj.intValue();   // unboxing (manual)

	        System.out.println("Boxed: " + obj);
	        System.out.println("Unboxed: " + b);
	    }
}
