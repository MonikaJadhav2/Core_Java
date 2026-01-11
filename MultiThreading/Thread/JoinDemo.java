package com.multi;

// main thread should wait for child thread
public class JoinDemo extends Thread{

	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println("Child Thread: " + i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
	
		JoinDemo t = new JoinDemo();
		t.start();
	
		t.join();         // main waits
		
		for(int i=1; i<=3; i++) {
			System.out.println("main Thread: " + i);
		}
		
	}
}
