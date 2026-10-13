package com.Abstraction;

abstract class BankInterest {
	double balance;

	public BankInterest(double balance) {
		this.balance = balance;
	}

	abstract double interestRate();
}

class CurrentAccount extends BankInterest {
	public CurrentAccount(double balance) {
		super(balance);
	}

	double interestRate() {
		double interest = (balance * 12)/100;
		
		return interest;
	}
}
