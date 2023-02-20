package com.yash.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entities.Employee;
import com.yash.exceptions.EmployeeNotFoundException;
import com.yash.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = repo.findAll();

		return employeeList;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		if(repo.findById(employeeId).isEmpty()) {
			throw new EmployeeNotFoundException("Employee not found with id : " + employeeId);
		}

		Employee employee = repo.findById(employeeId).get();
		
		return employee;
	}
	
	

}
