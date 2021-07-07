package com.example.springioc;

public class Employee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee Name :- " + name);
	}
}
