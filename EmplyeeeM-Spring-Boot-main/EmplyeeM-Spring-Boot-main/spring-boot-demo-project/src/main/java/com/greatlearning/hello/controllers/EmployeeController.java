package com.greatlearning.hello.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.hello.Entity.Employee;
import com.greatlearning.hello.Service.EmployeeService;

@RestController("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getEmployees")
	public List<Employee> getEmployees() {
		return employeeService.returnAllEmployees();
	}

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		employeeService.saveEmployee(emp);
		return emp;
	}

}
