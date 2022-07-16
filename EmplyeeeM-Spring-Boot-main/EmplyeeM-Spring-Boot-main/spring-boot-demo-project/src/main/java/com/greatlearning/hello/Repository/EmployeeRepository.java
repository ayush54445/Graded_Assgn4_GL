package com.greatlearning.hello.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.greatlearning.hello.Entity.Employee;

@Repository
public class EmployeeRepository {

	private List<Employee> employees = new ArrayList<Employee>();

	public void saveEmployee(Employee emp) {
		employees.add(emp);
	}

	public List<Employee> getAllEmployees() {
		return employees.stream().toList();
	}
}
