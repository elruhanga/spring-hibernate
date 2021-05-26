package com.green.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.green.model.Employee;
import com.green.service.EmployeeService;

@Controller
public class EmployeeController {
	EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/new_employee")
	public String enterNewEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "new_employee";
	}

	@PostMapping("/new_employee")
	public String newEmployee(@ModelAttribute Employee employee, Model model) {
		this.employeeService.save(employee);
		model.addAttribute("employees", this.employeeService.findAll());
		return "all_employee";
	}

	@GetMapping("/all_employee")
	public String allEmployee(Model model) {
		model.addAttribute("employees", this.employeeService.findAll());
		return "all_employee";
	}
}
