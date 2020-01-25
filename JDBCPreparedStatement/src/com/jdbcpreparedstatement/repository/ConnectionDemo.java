package com.jdbcpreparedstatement.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static Connection getconnection()  {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // loading database drivers
			System.out.println("Driver loaded!");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root", "password");

					
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("connection"+e.getMessage());
		}
		return con;
	}
}
