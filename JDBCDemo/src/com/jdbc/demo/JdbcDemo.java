package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class JdbcDemo {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.jdbc.Driver"); //loading database drivers
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud", "root", "password"); //creating connection
			Statement stmt = con.createStatement(); //creating statement
			PreparedStatement st = null; //creating prepared statement
			int choice = 0;
			do {
				System.out.println("*****welcome to database*****");
				System.out.println("1.Create database\n2.Create table\n3.Add User\n4.Delete user by ID\n5.Show data by ID\n6.Show all data\n7.Exit\nEnter your choice: ");
				choice = Utility.integerInput();
				switch (choice) {
				case 1:
					System.out.println("Enter name of database: ");
					String name = Utility.stringInput();
					stmt.execute("CREATE DATABASE IF NOT EXISTS " + name); // creating database if not exist
					System.out.println("Database created");
					break;
				case 2:
					System.out.println("Enter table name: ");
					String tblName = Utility.stringInput();
					stmt.execute("CREATE TABLE IF NOT EXISTS " + tblName
							+ "(id INTEGER not null, first VARCHAR(250), age INTEGER, PRIMARY KEY (id))"); //creating table if not exist in database
					System.out.println("Database created");
					break;
				case 3:
					st = (PreparedStatement) con.prepareStatement("insert into stud if not exists values(?,?,?)"); //executing data insertion query
					System.out.println("Enter Id (PreparedStatement): ");
					int prepId = Utility.integerInput();
					System.out.println("Enter name (PreparedStatement): ");
					String prepName = Utility.stringInput();
					System.out.println("Enter age (PreparedStatement): ");
					int prepAge = Utility.integerInput();
					st.setInt(1, prepId);
					st.setString(2, prepName);
					st.setInt(3, prepAge);
					st.executeUpdate(); //updating table in database
					System.out.println("Data inserted!");
					break;
				case 4:
					System.out.println("Enter id to delete (PreparedStatement): ");
					int deleteById = Utility.integerInput();
					st = (PreparedStatement) con.prepareStatement("delete from stud where id = ?"); //executing data deletion query
					st.setInt(1, deleteById);
					System.out.println("deleted using prepared statement");
					st.executeUpdate(); //updating data in database
					break;
				case 5:
					System.out.println("Enter id to display data: ");
					int id1 = Utility.integerInput();
					st = (PreparedStatement) con.prepareStatement("select * from stud where id = ?"); //executing query to display data by id
					st.setInt(1, id1);
					ResultSet rs = (ResultSet) st.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
					}

					break;
				case 6:
					st = (PreparedStatement) con.prepareStatement("select * from stud"); //executing query to display all data in table
					ResultSet detailRs = (ResultSet) st.executeQuery();
					while (detailRs.next()) {
						System.out.println(detailRs.getInt(1) + " " + detailRs.getString(2) + " " + detailRs.getInt(3));
					}
					break;
				case 7:
					System.out.println("Exiting....");
					break;

				default:
					System.out.println("Enter correct choice!!");
					break;
				}
			} while (choice != 7);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
