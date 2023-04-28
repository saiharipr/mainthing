package com.pro.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.emp.entity.Employee;
import com.pro.emp.service.IEmployeeService;

@RestController
@RequestMapping("/client/employee")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("/get/{employeeId}")
	public Employee getEmployee(@PathVariable long employeeId) {
		return employeeService.getEmployee(employeeId);
	}
}