package com.yash.services;

import java.util.List;

import com.yash.entities.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int employeeId);
}
