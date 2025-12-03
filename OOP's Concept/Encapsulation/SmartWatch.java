package com.encapsulation;

public class SmartWatch {
	private int heartRate;
	private int steps;

	// Getter for heart rate
	public int getHeartRate() {
		return heartRate;
	}

	// Setter with validation
	public void setHeartRate(int heartRate) {
		if (heartRate > 40 && heartRate < 200) {
			this.heartRate = heartRate;
		}
	}

	// Getter for steps
	public int getSteps() {
		return steps;
	}

	// Setter with validation
	public void setSteps(int steps) {
		if (steps >= 0) {
			this.steps = steps;
		}
	}
}
