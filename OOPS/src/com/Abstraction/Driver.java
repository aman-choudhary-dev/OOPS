package com.Abstraction;
public class Driver{
	public static void main(String[] args) {
		Vehicle v = new Car();
		Vehicle v1 = new Bike();
		v.startEngine();
		v1.startEngine();
	}
}
abstract class Vehicle {
	abstract  void startEngine();
}

class Car extends Vehicle{
	void startEngine() {
		System.out.println("Car engine started");
	}
}
class Bike extends Vehicle{
	void startEngine() {
		System.out.println("Bike engine started");
	}
}


