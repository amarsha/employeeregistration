package com.jcombat.controller;

import java.util.List;
import java.util.Map;

import com.jcombat.dto.Employee;
import com.jcombat.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;


	@RequestMapping(method = RequestMethod.POST,value="/create")
	public Employee createEmployee(@RequestBody Employee employee) {

		return employeeService.addEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> listEmployees() {

		return employeeService.listEmployees();
	}


}