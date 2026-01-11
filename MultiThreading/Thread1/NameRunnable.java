package com.thread1;

// print current Thread name

public class NameRunnable implements Runnable {

	public void run() {
		System.out.println("Running Thread: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		NameRunnable obj = new NameRunnable();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("Thread-A");
		t2.setName("Thread-B");
		
		t1.start();
		t2.start();
		
	}
}
