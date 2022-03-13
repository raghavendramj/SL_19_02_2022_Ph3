package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Employee;
import com.simplilearn.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping
	Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@GetMapping
	List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@GetMapping("/{id}")
	Employee getEmployeeById(@PathVariable("id") Long id) {
		return employeeService.getEmployee(id);
	}

	@GetMapping("/search")
	Employee getEmployeeById(@RequestParam("email") String email) {
		return employeeService.getEmployee(email);
	}

	@PutMapping("/{id}")
	void updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
		employeeService.updateEmployee(id, employee);
	}

	@DeleteMapping("/{id}")
	void deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployee(id);
	}
}
