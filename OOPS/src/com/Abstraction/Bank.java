package com.Abstraction;

public class Bank {
	public static void main(String[] args) {
		BankInterest b = new CurrentAccount(15000);
		double interest = b.interestRate();
		System.out.println("Interest is : " + interest);
	}
}
