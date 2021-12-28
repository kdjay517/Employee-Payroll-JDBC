package com.bridgelabz.employee_payroll;

public class Main {
	
	public static void main(String[] args) {
		Main employeePayrollService = new Main();
		employeePayrollService.getConnection();
	}
	
	private void getConnection() {
		JDBC_Connection connection = new JDBC_Connection();
		connection.getConnection();
	}
}
