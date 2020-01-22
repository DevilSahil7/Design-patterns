package com.jdbcdemo.servicedemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcdemo.model.DatabaseName;
import com.jdbcdemo.model.User;
import com.jdbcdemo.repository.ConnectionDemo;

import con.jdbcdemo.utility.Utility;

public class Service {

	Connection con = ConnectionDemo.getconnection();
	User user = new User();

	DatabaseName databaseName = new DatabaseName();

	public void addDatabase() throws SQLException {
		System.out.println("Enter name of database: ");
		databaseName.setDbName(Utility.stringInput());
		Statement sm = con.createStatement();
		System.out.println(databaseName.getDbName());
		sm.execute("CREATE DATABASE IF NOT EXISTS " + databaseName.getDbName());

		System.out.println("Database created");
	}

	public void addTable() throws SQLException {
		System.out.println("Enter table name: ");
		databaseName.setTableName(Utility.stringInput());
		Statement sm = con.createStatement();
		sm.execute("CREATE TABLE IF NOT EXISTS " + databaseName.getTableName()
				+ " (id INTEGER not null, first VARCHAR(250), age INTEGER, PRIMARY KEY (id))"); // creating table if not
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
		Statement sm = con.createStatement();

		sm.executeUpdate("INSERT INTO student1 VALUES (" + user.getUserId() + ", '" + user.getUserName() + "', "
				+ user.getUserAge() + ")");

		System.out.println("Data inserted!");
	}
	
	public void updateUser() throws SQLException {
		System.out.println("Enter id to update data: ");
		int userId = Utility.integerInput();
		Statement st = con.createStatement();
		System.out.println("Enter name: ");
		String uName = Utility.stringInput();
		System.out.println("Enter age: ");
		int uAge = Utility.integerInput();
		st.executeUpdate("update student1 set first = '"+uName+"', age = "+uAge+" where id = "+userId);
		System.out.println("Updated!");
	}
	
	public void showData() throws SQLException {
		Statement sm = con.createStatement();
		ResultSet rs = sm.executeQuery("select * from student1");
		while(rs.next()) {
			System.out.print("Id = "+rs.getString(1)+"\t");
			System.out.print("Name = "+rs.getString(2)+"\t");
			System.out.println("Age = "+rs.getString(3)+"\t");
		}
	}

	public void deleteUser(int deleteById) throws SQLException {
		Statement sm = con.createStatement();
		sm.executeUpdate("DELETE from student1 WHERE id = " + deleteById);

		System.out.println("Deleted " + deleteById);
	}
	
}
