package com.multi;

//Check thread status before start, after start, and after completion.

public class AliveDemo extends Thread{

	public void run() {
		System.out.println("Thread running.....!");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		AliveDemo t = new AliveDemo();
		
		System.out.println("Before start: " + t.isAlive());
		t.start();
		
		System.out.println("After Start: " +t.isAlive());
		
		t.join();
		System.out.println("After completion: " +t.isAlive());
	}
}
