package com.method;

public class Cube {
	
	int myCube() {
		int num = 2;
		int cube = num * num * num ;
		return cube;
	}	
    void myCubePara(int a) {
    	System.out.println("Cube of parameterized method = " +(a * a * a));
    
	}

}
