package com.multi;

//Print numbers 1 to 5, pause 1 second after each number.
public class SleepDemo extends Thread{
	
	public void run() {
		
		for(int i =1; i<=5; i++) {
			
			System.out.println("Number: " + i +  " | Time: " + System.currentTimeMillis());
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Thread Interupted");
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		SleepDemo t = new SleepDemo();
		t.start();
	}

}
