package com.scanner1;

import java.util.*;

//Take marks as float and check whether student is pass or fail.

public class PassOrFail {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float marks = sc.nextFloat();

		if (marks >= 35) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		sc.close();

	}
}
