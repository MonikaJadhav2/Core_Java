package com.loops;
import java.util.*;

public class IfDivideBy {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number:");
	        int num = sc.nextInt();
	        if (num % 10 == 0) {
	            System.out.println("Divisible by 10");
	        } 
	        else {
	            System.out.println("Not divisible by 10");
	        }
	   }
}

	
