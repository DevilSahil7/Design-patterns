package com.jdbcpreparedstatement.controller;

import java.sql.SQLException;

import com.jdbcpreparedstatement.service.Service;
import com.jdbcpreparedstatement.utility.Utility;




public class TestDemo {

	public static void main(String[] args) throws SQLException {
		
		Service service = new Service();

		int choice = 0;
		do {
			System.out.println("*****welcome to database*****");
			System.out.println(
					"1.Create database\n2.Create table\n3.Add User\n4.Delete user by ID\n5.Update user by id\n6.Show data\n7.Exit\nEnter your choice: ");
			choice = Utility.integerInput();
			switch (choice) {
			case 1:
				service.addDatabase();
				break;
			case 2:
				
				service.addTable();
				break;
			case 3:
				
				service.addUser();
				break;
			case 4:
				System.out.println("Enter id to delete: ");
				int deleteById = Utility.integerInput();
				service.deleteUser(deleteById);
				break;
			case 5:
				service.updateUser();
				break;
			case 6:
				service.showData();
				break;
			case 7:
				return;
				
			}
		} while (choice != 5);
	}
}
