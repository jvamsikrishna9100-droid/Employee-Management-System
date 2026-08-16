package com.ems.model;

public class Employee {

	// Instance Variables
	private int employeeId;
	private String employeeName;
	private int age;
	private String gender;
	private String designation;
	private double salary;
	private String phoneNumber;
	private String email;
	private int departmentId;

	// Default Constructor
	public Employee() {

	}

	// Parameterized Constructor
	public Employee(int employeeId, String employeeName, int age, String gender, String designation, double salary,
			String phoneNumber, String email, int departmentId) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.departmentId = departmentId;
	}

	// Getters

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	// Setters

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	// Display Method

	public void displayEmployee() {

		System.out.println("-----------------------------------------");
		System.out.println("Employee ID      : " + employeeId);
		System.out.println("Employee Name    : " + employeeName);
		System.out.println("Age              : " + age);
		System.out.println("Gender           : " + gender);
		System.out.println("Designation      : " + designation);
		System.out.println("Salary           : " + salary);
		System.out.println("Phone Number     : " + phoneNumber);
		System.out.println("Email            : " + email);
		System.out.println("Department ID    : " + departmentId);
		System.out.println("-----------------------------------------");
	}
}