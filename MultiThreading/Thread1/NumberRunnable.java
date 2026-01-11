package com.thread1;

//print numbers from 1 to 5

public class NumberRunnable implements Runnable{

	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		NumberRunnable obj = new NumberRunnable();
		Thread t = new Thread(obj);
		
		t.start();
	}
}
