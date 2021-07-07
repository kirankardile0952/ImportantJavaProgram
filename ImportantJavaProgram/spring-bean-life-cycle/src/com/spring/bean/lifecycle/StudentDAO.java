package com.spring.bean.lifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {

	private String driver;

	private String url;

	private String username;

	private String password;

	private Connection con;

//	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("inside the init() method");
		createStudentDBConnection();
	}

	public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
		System.out.println("Creating connection for StudentDB");
		// load the driver
		Class.forName(driver);

		con = DriverManager.getConnection(url, username, password);

	}

	public void selectAllRows() throws SQLException {
		System.out.println("Retrieve all Student data");

		// Execute query
		Statement statement = con.createStatement();

		ResultSet rs = statement.executeQuery("select * from student");

		while (rs.next()) {
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			String studentBranch = rs.getString(3);
			int studentMarks = rs.getInt(4);
			System.out.println(studentId + " " + studentName + " " + studentBranch + " " + studentMarks);

		}

	}

	public void deleteStudentRecord(int sid) throws ClassNotFoundException, SQLException {
		// Execute query
		Statement statement = con.createStatement();

		statement.executeUpdate("delete from student where sid=" + sid);
		System.out.println("Record deleted with the id is " + sid);

	}

//	@PreDestroy
	public void closeConnection() throws SQLException {
		//Clean up code orClosing the connection
		System.out.println("Clean Up Code or Closing The Connection");
		con.close();
	}

	public void setDriver(String driver) {
		System.out.println("Seeting Driver....");
		this.driver = driver;
	}

	public void setUrl(String url) {
		System.out.println("Seeting URL....");
		this.url = url;
	}

	public void setUsername(String username) {
		System.out.println("Seeting Username....");
		this.username = username;
	}

	public void setPassword(String password) {
		System.out.println("Seeting Password....");
		this.password = password;
	}
}
