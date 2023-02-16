package com.yash.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entities.Employee;
import com.yash.services.EmployeeService;

@RestController
@RequestMapping("v1/api/")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("employees")
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = null;
		
		employeeList = service.getAllEmployees();
		
		return employeeList;
	}
	
	@GetMapping("employee/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		Employee employee = null;
		
		employee = service.getEmployeeById(empId);
		return employee;
	}
}
