package com.spring.bean.lifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/bean/lifecycle/applicationcontext.xml");
		StudentDAO dao=context.getBean("dao",StudentDAO.class);
		System.out.println(dao);
		dao.selectAllRows();
		dao.deleteStudentRecord(101);
		context.close();
	}
}
