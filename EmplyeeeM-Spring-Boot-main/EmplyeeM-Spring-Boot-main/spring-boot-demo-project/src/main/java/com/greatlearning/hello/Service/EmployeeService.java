package com.greatlearning.hello.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.hello.Entity.Employee;
import com.greatlearning.hello.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void saveEmployee(Employee emp) {
		employeeRepository.saveEmployee(emp);
	}

	public List<Employee> returnAllEmployees() {
		return employeeRepository.getAllEmployees();
	}
}
