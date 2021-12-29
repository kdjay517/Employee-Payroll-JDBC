package com.bridgelabz.employee_payroll;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService {
	JDBC_Connection jc = new JDBC_Connection();

	public List<EmployeeData> getEmployeePayrollDataUsingDB() {
		Statement statement = null;
		Connection connection = null;
		List<EmployeeData> employeePayrollList = new ArrayList<>();
		String sql = "SELECT * FROM employee_payroll";
		try {
			connection = jc.getConnection();
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				double salary = result.getDouble("salary");
				LocalDate startDate = result.getDate("start").toLocalDate();
				employeePayrollList.add(new EmployeeData(id, name, salary, startDate));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return employeePayrollList;
	}
}
