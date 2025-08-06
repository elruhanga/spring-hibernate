package com.green.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String newEmployee(@ModelAttribute Employee employee) {
		this.employeeService.save(employee);
		return "redirect:/all_employee";
	}

	@GetMapping("/all_employee")
	public String allEmployee(Model model) {
		model.addAttribute("employees", this.employeeService.findAll());
		return "all_employee";
	}

	@GetMapping("/showUpdateForm/{id}")
	public String showUpdateForm(@PathVariable(value = "id") Integer id, Model model) {
		Employee employee = employeeService.findById(id).get();
		model.addAttribute("employee", employee);
		return "update_employee";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.save(employee);
		return "redirect:/all_employee";
	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") Integer id) {
		this.employeeService.deleteById(id);
		return "redirect:/all_employee";
	}

	@GetMapping("/search")
	public String search(@RequestParam("keyword") String keyword, Model model) {
		model.addAttribute("employees", employeeService.findByFirstName(keyword));
		model.addAttribute("keyword", keyword);
		return "all_employee";
	}
}
