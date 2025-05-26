package com.hpe.employees;

import java.util.Arrays;

public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.setEmployeeList(Arrays.asList(
            new Employee(1, "John", "Doe", "john.doe@example.com", "Developer"),
            new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Manager"),
            new Employee(3, "Alice", "Johnson", "alice.johnson@example.com", "Analyst")
        ));
    }

    public Employees getEmployees() {
        return employees;
    }
}
