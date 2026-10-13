package com.Inheritance;
// Heirarchical Inheritance Multiple classes inherited employee class
class Employee{
	String name ;
	int id;
	double salary;
	public Employee(String name, int id , double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void calculateSalary() {
		System.out.println("salary is : " + salary);
	}
	
}
class Manager extends Employee{
	String level;

	public Manager(String name, int id, String level , double salary) {
		super(name, id , salary);
		this.level = level;
	}
	@Override
	void calculateSalary() {
		System.out.println("Salary of manager is : " + (salary*10));
	}
	
}
class Developer extends Employee{
	String role;

	public Developer(String name, int id, String role , double salary) {
		super(name, id , salary);
		this.role = role;
	}
	@Override
	void calculateSalary() {
		System.out.println("Salary of Developer is : " + (salary*20));
	}
}
public class Inheritance1 {
	public static void main(String[] args) {
		Developer d = new Developer("Aman", 5656, "Java Developer", 200000);
		d.calculateSalary();
		Manager m = new Manager("Rahul", 654164, "Admin", 555155);
		m.calculateSalary();
	}
	
}
