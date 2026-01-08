package com.multi;

public class MyThread extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("myThread  " + i);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void m1() {

		for (int i = 11; i <= 20; i++) {

			System.out.println("M1 Logic " + i);
		}
	}
}
