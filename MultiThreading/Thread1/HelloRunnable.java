package com.thread1;

public class HelloRunnable implements Runnable {

	public void run() {
		System.out.println("Hello from runnable");
	}

	public static void main(String[] args) {

		HelloRunnable obj = new HelloRunnable();
		Thread t = new Thread(obj);

		t.start();
	}
}