package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		EmployeeService employeeService = new EmployeeService();

		int choice;

		do {

			System.out.println("\n==============================================");
			System.out.println("     EMPLOYEE MANAGEMENT SYSTEM");
			System.out.println("==============================================");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Search Employee By ID");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");
			System.out.println("==============================================");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {

			case 1:

				Employee employee = new Employee();

				System.out.println("\n========== ADD EMPLOYEE ==========");

				scanner.nextLine();

				System.out.print("Enter Employee Name : ");
				employee.setEmployeeName(scanner.nextLine());

				System.out.print("Enter Age : ");
				employee.setAge(scanner.nextInt());

				scanner.nextLine();

				System.out.print("Enter Gender : ");
				employee.setGender(scanner.nextLine());

				System.out.print("Enter Designation : ");
				employee.setDesignation(scanner.nextLine());

				System.out.print("Enter Salary : ");
				employee.setSalary(scanner.nextDouble());

				scanner.nextLine();

				System.out.print("Enter Phone Number : ");
				employee.setPhoneNumber(scanner.nextLine());

				System.out.print("Enter Email : ");
				employee.setEmail(scanner.nextLine());

				System.out.print("Enter Department ID : ");
				employee.setDepartmentId(scanner.nextInt());

				boolean status = employeeService.addEmployee(employee);

				if (status) {
					System.out.println("\nEmployee Added Successfully.");
				} else {
					System.out.println("\nFailed to Add Employee.");
				}

				break;
			case 2:

				List<Employee> employeeList = employeeService.getAllEmployees();

				if (employeeList.isEmpty()) {

					System.out.println("\nNo Employee Records Found.");

				} else {

					System.out.println("\n================ EMPLOYEE LIST ================");

					for (Employee employee1 : employeeList) {

						System.out.println("----------------------------------------------");
						System.out.println("Employee ID      : " + employee1.getEmployeeId());
						System.out.println("Employee Name    : " + employee1.getEmployeeName());
						System.out.println("Age              : " + employee1.getAge());
						System.out.println("Gender           : " + employee1.getGender());
						System.out.println("Designation      : " + employee1.getDesignation());
						System.out.println("Salary           : " + employee1.getSalary());
						System.out.println("Phone Number     : " + employee1.getPhoneNumber());
						System.out.println("Email            : " + employee1.getEmail());
						System.out.println("Department ID    : " + employee1.getDepartmentId());
					}

					System.out.println("----------------------------------------------");
				}

				break;

			case 3:

				System.out.print("Enter Employee ID : ");
				int employeeId = scanner.nextInt();

				Employee employee1 = employeeService.getEmployeeById(employeeId);

				if (employee1 != null) {

					System.out.println("\n========== Employee Details ==========");

					System.out.println("Employee ID      : " + employee1.getEmployeeId());
					System.out.println("Employee Name    : " + employee1.getEmployeeName());
					System.out.println("Age              : " + employee1.getAge());
					System.out.println("Gender           : " + employee1.getGender());
					System.out.println("Designation      : " + employee1.getDesignation());
					System.out.println("Salary           : " + employee1.getSalary());
					System.out.println("Phone Number     : " + employee1.getPhoneNumber());
					System.out.println("Email            : " + employee1.getEmail());
					System.out.println("Department ID    : " + employee1.getDepartmentId());

				} else {

					System.out.println("Employee Not Found!");

				}

				break;

			case 4:

				Employee updateEmployee = new Employee();

				System.out.print("Enter Employee ID : ");
				updateEmployee.setEmployeeId(scanner.nextInt());

				scanner.nextLine();

				System.out.print("Enter New Employee Name : ");
				updateEmployee.setEmployeeName(scanner.nextLine());

				System.out.print("Enter New Age : ");
				updateEmployee.setAge(scanner.nextInt());

				scanner.nextLine();

				System.out.print("Enter New Gender : ");
				updateEmployee.setGender(scanner.nextLine());

				System.out.print("Enter New Designation : ");
				updateEmployee.setDesignation(scanner.nextLine());

				System.out.print("Enter New Salary : ");
				updateEmployee.setSalary(scanner.nextDouble());

				scanner.nextLine();

				System.out.print("Enter New Phone Number : ");
				updateEmployee.setPhoneNumber(scanner.nextLine());

				System.out.print("Enter New Email : ");
				updateEmployee.setEmail(scanner.nextLine());

				System.out.print("Enter New Department ID : ");
				updateEmployee.setDepartmentId(scanner.nextInt());

				if (employeeService.updateEmployee(updateEmployee)) {
					System.out.println("Employee Updated Successfully.");
				} else {
					System.out.println("Employee Update Failed.");
				}

				break;

			case 5:

				System.out.print("Enter Employee ID : ");
				int deleteId = scanner.nextInt();

				if (employeeService.deleteEmployee(deleteId)) {
					System.out.println("Employee Deleted Successfully.");
				} else {
					System.out.println("Employee Not Found.");
				}

				break;

			case 6:
				System.out.println("Thank you for using Employee Management System.");
				break;

			default:
				System.out.println("Invalid Choice! Please try again.");
			}

		} while (choice != 6);

		scanner.close();
	}
}