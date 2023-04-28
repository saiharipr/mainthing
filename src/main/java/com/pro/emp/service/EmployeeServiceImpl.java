package com.pro.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pro.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${service.host}")
	private String host;
	
	public Employee getEmployee(long employeeId) {
		return restTemplate.getForObject(host + "/api/employee/get/" + employeeId, Employee.class);
	}

}