package com.example.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/dependencyinjection/beans.xml");

		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();

		Student stud = context.getBean("stud", Student.class);
		stud.displayStudentInfo();

	}
}
