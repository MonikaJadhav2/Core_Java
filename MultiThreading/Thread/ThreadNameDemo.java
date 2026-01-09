package com.multi;

// Print current thread name inside run().
public class ThreadNameDemo extends Thread{

	public void run() {
		
		System.out.println("Current Running Thread : " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		ThreadNameDemo t = new ThreadNameDemo();
		t.start();
	}
}
