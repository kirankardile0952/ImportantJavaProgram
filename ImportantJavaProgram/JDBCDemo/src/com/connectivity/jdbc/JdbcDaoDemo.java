package com.connectivity.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDaoDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudent(2);
		System.out.println(s1.sname);
		
		
		  Student s2=new Student(); 
		  s2.rollno=5;
		  s2.sname="Ganesh";
		  dao.connect();
		  dao.addStudent(s2);
		
	}

}

class StudentDAO {
	
	Connection con=null;
	
	public void connect() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PracticeDB", "postgres", "root");
	}
	public Student getStudent(int rollno) throws SQLException  {
		String query = "select * from stud where rollno=" + rollno;
		Student s = new Student();
		s.rollno = rollno;
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		
		String name=rs.getString("sname");
		
		s.sname=name;
		return s;
	}
	
	public void addStudent(Student s) throws SQLException
	{
		String query="insert into stud values(?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1,s.rollno);
		pst.setString(2, s.sname);
		pst.executeUpdate();
		
	}
}

class Student {

	int rollno;
	String sname;
}