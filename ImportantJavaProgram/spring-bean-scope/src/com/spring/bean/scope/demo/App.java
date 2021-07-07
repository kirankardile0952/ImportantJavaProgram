package com.spring.bean.scope.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/bean/scope/demo/applicationcontext.xml");
		// Singleton
		/*
		 * SingletonDemo obj1 = context.getBean("singletonDemo", SingletonDemo.class);
		 * SingletonDemo obj2 = context.getBean("singletonDemo", SingletonDemo.class);
		 * 
		 * System.out.println(obj1+"------"+obj2);
		 * 
		 * if(obj1==obj2) { System.out.println("Same objects are returned"); }
		 */

		// Prototype
		/*
		 * 
		 * PrototypeDemo obj1 = context.getBean("prototypeDemo", PrototypeDemo.class);
		 * PrototypeDemo obj2 = context.getBean("prototypeDemo", PrototypeDemo.class);
		 * if (obj1 == obj2) { System.out.println("obj1 and obj2 are same"); } else {
		 * System.out.println("obj1 and obj2 are not same"); }
		 */

		/*
		 * Student student1 = context.getBean("student", Student.class);
		 * student1.setName("Kiran"); System.out.println(student1.getName());
		 * 
		 * Student student2=context.getBean("student",Student.class);
		 * System.out.println(student2.getName());
		 */

		/*
		 * School obj1=context.getBean("school",School.class);
		 * 
		 * System.out.println(obj1.getStudent()); System.out.println(obj1.getStudent());
		 */
		
		context.getBean("b",B.class);
		context.getBean("b",B.class);
		context.getBean("b",B.class);
		context.getBean("b",B.class);
		
	}
}
