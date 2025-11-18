package com.loops;
import java.util.Scanner;

public interface VowelConsonont {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Character :");
	        char ch = sc.next().toLowerCase().charAt(0);

	        switch(ch) {
	            case 'a': 
	            case 'b': 
	            case 'i': 
	            case 'o': 
	            case 'u': System.out.println("Vowel"); break;

	            default: System.out.println("Consonant");
	        }
	}


}
