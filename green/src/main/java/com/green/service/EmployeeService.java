package com.green.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.green.model.Employee;

public interface EmployeeService extends JpaRepository<Employee, Integer> {
	Employee findByFirstName();
}
