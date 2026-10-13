package com.Polymorphism;

public class BookingSystem {
	String name;
	String email;
	long phNo;
	void ticketBook(String name) {
		System.out.println("Your Ticket is Booked ");
		System.out.println("Name : " + name);
	}
	void ticketBook(String name , String email) {
		System.out.println("Your Ticket is Booked ");
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
	}
	void ticketBook(String name , long phNo) {
		System.out.println("Your Ticket is Booked ");
		System.out.println("Name : " + name);
		System.out.println("phNo : " + phNo);
	}
}
