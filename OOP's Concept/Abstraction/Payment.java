package com.abstraction;

public interface Payment {

	public static final double transactionfees = 6;

	public abstract void pay(double amount);

}
