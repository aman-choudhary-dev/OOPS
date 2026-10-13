package com.Polymorphism;

public class BankDriver {
	public static void main(String[] args) {
		Bank u1 = new Bank("Aman Choudhary", "484946151", 51916.16);
		u1.accDetails();
		u1.deposit(500);
		u1.withdraw(8000);
		u1.showBalance();
	}
}
