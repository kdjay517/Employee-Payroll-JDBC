package com.bridgelabz.employee_payroll;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Main employeePayroll = new Main();
		employeePayroll.getConnection();
		employeePayroll.showEmployeeDetails();
	}
	
	private void getConnection() {
		JDBC_Connection connection = new JDBC_Connection();
		connection.getConnection();
	}
	
	private void showEmployeeDetails() {
		EmployeePayrollService eps = new EmployeePayrollService();
		List<EmployeeData> employeeList = eps.getEmployeePayrollDataUsingDB();
		employeeList.stream()
					.forEach(e -> System.out.println("Id:"+e.id
							+"EmpName:"+e.name
							+"EmpSalary:"+e.salary
							+"StartDate:"+e.start));
	}
}
