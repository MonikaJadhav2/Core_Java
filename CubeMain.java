package com.method;

public class CubeMain {

	public static void main(String[] args) {
		Cube c = new Cube();
		int c1 = c.myCube();
		System.out.println("Cube = " + c1 );
		
		//System.out.println(c.myCube());
		
		c.myCubePara(5);
	}
}
