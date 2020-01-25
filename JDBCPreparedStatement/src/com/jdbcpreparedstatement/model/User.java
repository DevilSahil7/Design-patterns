package com.jdbcpreparedstatement.model;

public class User {

	int userId;
	String userName;
	int userAge;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
	
	/*
	 *package com.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.model.Database;
import com.jdbc.model.User;

import con.jdbc.utility.Utility;

public class StatementMain {

	public static void main(String[] args) throws SQLException {
		User user = new User();
		Database database = new Database();
		Connection con = (Connection) com.jdbc.repository.Connection.getconnection();
		Statement sm = con.createStatement();

		int choice = 0;
		do {
			System.out.println("*****welcome to database*****");
			System.out.println(
					"1.Create database\n2.Create table\n3.Add User\n4.Delete user by ID\n5.Show data by ID\n6.Show all data\n7.Exit\nEnter your choice: ");
			choice = Utility.integerInput();
			switch (choice) {
			case 1:
				System.out.println("Enter name of database: ");
				database.setDbName(Utility.stringInput());
				sm.execute("CREATE DATABASE IF NOT EXISTS " + database.getDbName());
				System.out.println("Database created");
				break;
			case 2:
				System.out.println("Enter table name: ");
				database.setTableName(Utility.stringInput());
				sm.execute("CREATE TABLE IF NOT EXISTS " + database.getTableName()
						+ "(id INTEGER not null, first VARCHAR(250), age INTEGER, PRIMARY KEY (id))"); //creating table if not exist in database
				System.out.println("Table created");
				break;
			case 3:
				System.out.println("Enter Id (PreparedStatement): ");
				user.setUserName(Utility.stringInput());
				System.out.println("Enter name (PreparedStatement): ");
				user.setUserId(Utility.integerInput());
				System.out.println("Enter age (PreparedStatement): ");
				user.setUserAge(Utility.integerInput());
				sm.executeUpdate("INSERT INTO "+database.getDbName()+" " +
                   "VALUES ("+user.getUserId()+", '"+user.getUserName()+"', "+user.getUserAge()+")");
				System.out.println("Data inserted!");
				break;
			case 4:
				System.out.println("Enter id to delete (PreparedStatement): ");
				int deleteById = Utility.integerInput();
				sm.executeUpdate("DELETE from "+database.getDbName()+" WHERE id = "+deleteById);
				System.out.println("Deleted "+deleteById);
				break;
				
				
			}
		} while (choice != 0);
	}
}

	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
