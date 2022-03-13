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

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployee(Long id) {
		Optional<Employee> employeeOptional = employeeRepository.findById(id);

		if (employeeOptional.isPresent()) {
			return employeeOptional.get();
		}
		return null;
	}

	@Override
	public Employee getEmployee(String email) {
		return employeeRepository.findByEmail(email);
	}

	@Override
	public void updateEmployee(Long id, Employee employee) {
		Optional<Employee> employeeOptional = employeeRepository.findById(id);

		if (employeeOptional.isPresent()) {
			// update operation!
			employeeRepository.save(employee);
		}
	}

	@Override
	public void deleteEmployee(Long id) {
		Optional<Employee> employeeOptional = employeeRepository.findById(id);
		if (employeeOptional.isPresent()) {
			employeeRepository.delete(employeeOptional.get());
		}
	}
}
