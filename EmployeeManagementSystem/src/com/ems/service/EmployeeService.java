package com.ems.service;

import java.util.List;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;

public class EmployeeService {

	private EmployeeDAO employeeDAO;

	// Constructor
	public EmployeeService() {
		employeeDAO = new EmployeeDAO();
	}

	// Add Employee
	public boolean addEmployee(Employee employee) {

		// Validation
		if (employee.getEmployeeName() == null || employee.getEmployeeName().trim().isEmpty()) {
			System.out.println("Employee name cannot be empty.");
			return false;
		}

		if (employee.getAge() < 18) {
			System.out.println("Employee age must be 18 or above.");
			return false;
		}

		if (employee.getSalary() <= 0) {
			System.out.println("Salary must be greater than 0.");
			return false;
		}

		return employeeDAO.addEmployee(employee);
	}

	// View All Employees
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	// Search Employee By ID
	public Employee getEmployeeById(int employeeId) {
		return employeeDAO.getEmployeeById(employeeId);
	}

	// Update Employee
	public boolean updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	// Delete Employee
	public boolean deleteEmployee(int employeeId) {
		return employeeDAO.deleteEmployee(employeeId);
	}
}