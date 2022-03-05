package com.simplilearn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Employee;
import com.simplilearn.repository.EmployeeRepository;
import com.simplilearn.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployee(Long id) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);

		if (optionalEmployee.isPresent())	
			return optionalEmployee.get();

		return null;
	}

	public Employee getEmployee(String firstName, String lastName) {
		return employeeRepository.findByFirstNameAndLastName(firstName, lastName);
	}

	public void updateEmployee(Long id, Employee modifiedEmployee) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		if (optionalEmployee.isPresent()) {
			employeeRepository.save(modifiedEmployee);
		}
	}

	public void deleteEmployee(Long id) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		if (optionalEmployee.isPresent()) {
			employeeRepository.delete(optionalEmployee.get());
		}
	}

}
