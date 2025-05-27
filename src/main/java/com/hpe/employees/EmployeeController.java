package com.hpe.employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

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
        // Add debug log to verify incoming data
        logger.debug("Received new employee data: {}", newEmployee);

        // Ensure employeeList is initialized
        if (employeeManager.getEmployees().getEmployeeList() == null) {
            employeeManager.getEmployees().setEmployeeList(new ArrayList<>());
        }

        try {
            employeeManager.getEmployees().getEmployeeList().add(newEmployee);
        } catch (Exception e) {
            // Log detailed error message
            logger.error("Error occurred while adding a new employee: {}", e.getMessage(), e);
            // Throw a ResponseStatusException with a meaningful message and HTTP status code
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to add employee", e);
        }
    }
}
