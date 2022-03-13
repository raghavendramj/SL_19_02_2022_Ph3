package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Employee;

public interface EmployeeService {
	//CREATE
	Employee createEmployee(Employee employee);

	//READ
	List<Employee> getEmployees();
	Employee getEmployee(Long id);
	Employee getEmployee(String email);

	//UPDATE
	void updateEmployee(Long id, Employee employee);

	
	//DELETE
	void deleteEmployee(Long id);
}
