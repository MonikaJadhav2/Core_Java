package com.static1;

public class Outer {

	void m1() {
		System.out.println("This is outer class mehtod m1");
	}

	public static class Inner {
		static void m2() {                                 
			System.out.println("This is inner class m2 method");
		}
	}

	public static void main(String[] args) {
		Outer o = new Outer();                    // Outer class object creation
//		o.m1();

//		Outer.Inner i = new Inner();             //static inner class non static method call
//		i.m2();
		
		Outer.Inner.m2();            //static class static method call no need to create object
	}

}

