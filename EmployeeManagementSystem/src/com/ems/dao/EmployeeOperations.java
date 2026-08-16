package com.ems.dao;

import java.util.List;
import com.ems.model.Employee;

public interface EmployeeOperations {

    // Create
    boolean addEmployee(Employee employee);

    // Read All
    List<Employee> getAllEmployees();

    // Read by ID
    Employee getEmployeeById(int employeeId);

    // Update
    boolean updateEmployee(Employee employee);

    // Delete
    boolean deleteEmployee(int employeeId);
}