package com.Polymorphism;

public class Bank {
	private String accHolderName;
	private String accNO;
	private double balance ;
	public Bank(String accHolderName, String accNO, double balance) {
		super();
		this.accHolderName = accHolderName;
		this.accNO = accNO;
		this.balance = balance;
	}
	public void accDetails() {
		System.out.println("Account no        : " + accNO);
		System.out.println("Account User Name : " + accHolderName);
		System.out.println("Current Balance   : " + balance  ) ;
	}
	
	public double showBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}else {
			System.err.println("Invalid amount");
		}
	}
	public void withdraw(double amount) {
		if(amount > 0 && amount < balance) {
			balance -= amount;
			System.out.println("Withdrawed amount : " + amount);
			System.out.println("Current Balance : " + balance);
		}else {
			System.err.println("ENTER VALID AMOUNT");
		}
	}
}
