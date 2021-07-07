package com.connectivity.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*Jdbc Connectivity Steps
 * 1)import package ->java.sql
 * 2)Load and Register the Driver
 * 3)Establish the connection
 * 4)Create Statement
 * 5)Execute Statement/Query
 * 6)Process Results
 * 7)Closing Connection
 * 
 */

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:postgresql://localhost:5432/PracticeDB";
		String uname = "postgres";
		String pass = "root";
		String query = "select * from stud";

//		Class.forName("org.postgresql.Driver");

		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(query);
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString("sname"));
	}

}
