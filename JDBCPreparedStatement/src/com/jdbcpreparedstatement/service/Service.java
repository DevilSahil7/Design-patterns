package com.jdbcpreparedstatement.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcpreparedstatement.model.DatabaseName;
import com.jdbcpreparedstatement.model.User;
import com.jdbcpreparedstatement.repository.ConnectionDemo;
import com.jdbcpreparedstatement.utility.Utility;



public class Service {

	Connection con = ConnectionDemo.getconnection();
	User user = new User();

	DatabaseName databaseName = new DatabaseName();

	public void addDatabase() throws SQLException {
		System.out.println("Enter name of database: ");
		databaseName.setDbName(Utility.stringInput());
		
		PreparedStatement preparedStatement = con.prepareStatement("CREATE DATABASE IF NOT EXISTS values(?)");
		preparedStatement.setString(1, databaseName.getDbName());
		System.out.println(databaseName.getDbName());
		
		System.out.println("Database created");
	}

	public void addTable() throws SQLException {
		System.out.println("Enter table name: ");
		databaseName.setTableName(Utility.stringInput());
		PreparedStatement preparedStatement = con.prepareStatement("CREATE TABLE IF NOT EXISTS values(?)"
				+ "(id INTEGER not null, first VARCHAR(250), age INTEGER, PRIMARY KEY (id))");
		preparedStatement.setString(1, databaseName.getTableName());
		// exist in database
		System.out.println("Table created");
	}

	public void addUser() throws SQLException {
		System.out.println("Enter Id: ");
		user.setUserId(Utility.integerInput());
		System.out.println("Enter name: ");
		user.setUserName(Utility.stringInput());
		System.out.println("Enter age: ");
		user.setUserAge(Utility.integerInput());
		PreparedStatement preparedStatement = con.prepareStatement("insert into student1 values(?,?,?)");
		preparedStatement.setInt(1, user.getUserId());
		preparedStatement.setString(2, user.getUserName());
		preparedStatement.setInt(3, user.getUserAge());
		
		preparedStatement.executeUpdate();

		System.out.println("Data inserted!");
	}
	
	public void updateUser() throws SQLException {
		System.out.println("Enter id to update data: ");
		int userId = Utility.integerInput();
		
		System.out.println("Enter name: ");
		String uName = Utility.stringInput();
		System.out.println("Enter age: ");
		int uAge = Utility.integerInput();
		PreparedStatement preparedStatement = con.prepareStatement("update student1 set first = ?, age = ? where id = "+userId);
		preparedStatement.setString(1, uName);
		preparedStatement.setInt(2, uAge);
		
		preparedStatement.executeUpdate();
		
		System.out.println("Updated!");
	}
	
	public void showData() throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT id, first, age FROM student1");
		
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next()) {
			System.out.print("Id = "+rs.getString(1)+"\t");
			System.out.print("Name = "+rs.getString(2)+"\t");
			System.out.println("Age = "+rs.getString(3)+"\t");
		}
	}

	public void deleteUser(int deleteById) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("DELETE from student1 WHERE id = " + deleteById);
		
		preparedStatement.executeUpdate();

		System.out.println("Deleted " + deleteById);
	}
	
}
