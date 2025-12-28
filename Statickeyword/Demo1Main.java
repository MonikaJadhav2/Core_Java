package com.static1;

public class Demo1Main {
	
	{
		System.out.println("Non-static");
	}
	 public static void main(String[] args) {
			Demo1 d = new Demo1(1 ,"Mona");
			Demo1 d1 = new Demo1(2 ,"Anshul");
			d.display();
			d1.display();
			
			Demo1Main m1 = new Demo1Main();	
			Demo1Main m2 = new Demo1Main();
		}

}
