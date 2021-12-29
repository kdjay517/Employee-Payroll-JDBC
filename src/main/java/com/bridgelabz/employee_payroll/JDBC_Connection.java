package com.bridgelabz.employee_payroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connection {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/payroll_service";
		String user = "root";
		String password = "system";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded Driver Class");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
