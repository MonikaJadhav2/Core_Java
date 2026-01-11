package com.multi;

// create two threads with different priority
public class PriorityDemo extends Thread{

	public void run() {
		System.out.println(getName() + "Priority: " +getPriority());
	}
	
	public static void main(String[] args) {
		
		PriorityDemo t1 = new PriorityDemo();
		PriorityDemo t2 = new PriorityDemo();
		
		t1.setName("Low priority");
		t2.setName("High pririty");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		
	}
}
