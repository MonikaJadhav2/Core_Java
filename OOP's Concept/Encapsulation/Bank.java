package com.encapsulation;

public class Bank {
	private String accountHolder;
    private double balance;

   
    public String getAccountHolder() {
        return accountHolder;
    }

    
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

   
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
