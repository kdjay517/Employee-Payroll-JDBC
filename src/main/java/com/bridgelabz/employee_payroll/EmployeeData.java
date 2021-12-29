package com.bridgelabz.employee_payroll;

import java.time.LocalDate;

public class EmployeeData {
	public int id;
	public String name;
	public double salary;
	public LocalDate start;

	public EmployeeData(int id, String name, double salary, LocalDate start) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.start = start;
	}

	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", salary=" + salary + ", start=" + start + "]";
	}
	
}
