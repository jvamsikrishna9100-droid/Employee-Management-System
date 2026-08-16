package com.ems.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	// Database URL
	private static final String URL = "jdbc:mysql://localhost:3306/employee_management_system";

	// MySQL Username
	private static final String USERNAME = "root";

	// MySQL Password
	private static final String PASSWORD = "root"; // Change this if your password is different

	// Method to get database connection
	public static Connection getConnection() {

		Connection connection = null;

		try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish Connection
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			System.out.println("Database Connected Successfully!");

		} catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver Not Found!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed to Connect to Database!");
			e.printStackTrace();
		}

		return connection;
	}
}
