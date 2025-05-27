package com.hpe.employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    private EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return employeeManager.getEmployees();
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee newEmployee) {
        try {
            employeeManager.getEmployees().getEmployeeList().add(newEmployee);
        } catch (Exception e) {
            logger.error("Error occurred while adding a new employee: ", e);
            throw e;
        }
    }
}
