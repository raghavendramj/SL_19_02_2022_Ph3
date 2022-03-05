package com.simplilearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.Employee;

@Service
public interface EmployeeService {
	// Create
	Employee createEmployee(Employee employee);

	// Read
	List<Employee> getAllEmployees();
	Employee getEmployee(Long id);
	Employee getEmployee(String firstName, String lastName);

	// Update
	void updateEmployee(Long id, Employee employee);

	// Delete
	void deleteEmployee(Long id);
}
