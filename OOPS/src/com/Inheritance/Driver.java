package com.Inheritance;

interface Account {
	default void showBalance() {
		System.out.println("Balance  in account");
	}
}

interface SavingsAccount {
	default void showBalance() {
		System.out.println("Balance in Savings Account");
	}
}

class PremiumAccount implements Account, SavingsAccount {
	public void showBalance() {
		System.out.println("Balance in premium account");
	}
}

public class Driver {
	public static void main(String[] args) {
		PremiumAccount p = new PremiumAccount();
		p.showBalance();
	}
}
