package com.thread1;
import java.lang.Thread;

public class MyThread2 extends Thread {

	public void run() {
		System.out.println("Thread is running = " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		MyThread2 t = new MyThread2();
		t.run();
		t.start();
		
	}
}
