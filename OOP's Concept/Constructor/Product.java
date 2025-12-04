package com.constructor;

public class Product {
	String productName;
	double price;
	
	Product(){
		productName = "TV";
		price = 100000;
		this.display();
	}
	
	Product(String pName , int price){
		productName = pName;
		price = price;
		this.display();
	}
	
	void display() {
		System.out.println("Product Name = " + productName);
		System.out.println("Price = " + price);
	}
}
