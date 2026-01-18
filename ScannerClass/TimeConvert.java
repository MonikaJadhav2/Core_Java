package com.scanner1;
import java.util.*;

//Take time in seconds and convert into minutes and seconds.

public class TimeConvert {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter seconds : ");
		int s = sc.nextInt();
		
		System.out.println("Minutes: " + s/60);
		System.out.println("Seconds : " + s%60);
	}

}

