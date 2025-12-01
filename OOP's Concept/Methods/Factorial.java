package com.method;

public class Factorial {

	int myFact() {
		int num = 3;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
