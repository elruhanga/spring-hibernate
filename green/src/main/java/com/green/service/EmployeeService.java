package com.green.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.green.model.Employee;

import java.util.List;

public interface EmployeeService extends JpaRepository<Employee, Integer> {
	List<Employee> findByFirstName(String firstName);
}
