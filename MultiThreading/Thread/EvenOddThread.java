package com.multi;

//Create two threads:
// 1.One prints even numbers
// 2.One prints odd numbers

public class EvenOddThread extends Thread{
	
	int start;
	
	EvenOddThread(int start){
		this.start = start;
	}

	public void run() {
		
		for(int i= start; i<=10; i=i+2) {
			
			System.out.println(getName() + ":" + i);
		}
	}
	
	public static void main(String[] args) {
		
		EvenOddThread even = new EvenOddThread(2);
		EvenOddThread odd = new EvenOddThread(1);
		
		even.setName("Even-Thread");
		odd.setName("Odd-Thread");
		
		even.start();
		odd.start();
	}
}


