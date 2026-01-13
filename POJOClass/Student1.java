package com.pojo;

public class Student1 {

	//private variables
	private int id;
	private String name;
	private double percentage;
	
	
	//constructors
	public Student1() {
		super();
	}

	public Student1(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	
	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	//display method
	public void display() {
		System.out.println("ID: " +id);
		System.out.println("Name: " +name);
		System.out.println("Percentage: " +percentage);
	}
	
	
	
}

