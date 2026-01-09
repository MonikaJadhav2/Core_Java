package com.multi;

// Create a thread that prints numbers from 1 to 5.
public class NumberThread extends Thread{

	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		 NumberThread t = new NumberThread();
//		Thread t = new Thread();
		t.start();
	}
}
