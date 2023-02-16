package com.yash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
