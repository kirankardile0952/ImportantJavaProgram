package com.example.dependencyinjection;

public class Student {
	private int id;

	public Student(int id) {
		this.id = id;
	}

	private String studentName;

	// Constructor Injection
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public Student() {
		System.out.println("Student Constructor Called");
	}

	// Setter Injection
	/*
	 * public void setId(int id) { this.id = id;
	 * System.out.println("id setter method called :- "+id); }
	 * 
	 * //Setter Injection public void setStudentName(String studentName) {
	 * this.studentName = studentName;
	 * System.out.println("studentName setter method called :- "+studentName); }
	 */

	public void displayStudentInfo() {
		System.out.println("Student name is : " + studentName + " and id is :- " + id);

	}
}
