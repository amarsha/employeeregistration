package com.jcombat.service;


import com.jcombat.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<Employee>();


    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("EmployeeService.addEmployee() invoked " + employee);
        return employee;
    }

    public List<Employee> listEmployees(){
        return employeeList;
    }


}
