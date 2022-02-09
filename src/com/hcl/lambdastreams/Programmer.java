package com.hcl.lambdastreams;

public class Programmer {

	private int id;
	private String name;
	private int salary;
	
	// Constructors for a programmer
	Programmer() {
	}

	Programmer(int id, String name, int salary) {
		
		this.id= id;
		this.name = name;
		this.salary = salary;
	
		
	// These are the setter and getter methods for the variables
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
