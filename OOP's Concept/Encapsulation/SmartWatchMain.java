package com.encapsulation;

public class SmartWatchMain {
	public static void main(String[] args) {

		SmartWatch sw = new SmartWatch();

		sw.setHeartRate(88);
		sw.setSteps(4500);

		System.out.println("Heart Rate: " + sw.getHeartRate());
		System.out.println("Total Steps Today: " + sw.getSteps());
	}
}
