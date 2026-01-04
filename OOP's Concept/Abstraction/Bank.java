package com.abstraction;

public interface Bank {

	public static final int pin = 23455;

	public abstract int checkBalance();          //interface only declare methods no implentation 
	                                            // even if we dont declare the all vaiables in interfaces are public ststic and final
	                                            //methods are always abstract

}
