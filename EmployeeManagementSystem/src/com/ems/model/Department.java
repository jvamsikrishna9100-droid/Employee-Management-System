package com.ems.model;

public class Department {

    // Instance Variables
    private int departmentId;
    private String departmentName;
    private String location;

    // Default Constructor
    public Department() {

    }

    // Parameterized Constructor
    public Department(int departmentId, String departmentName, String location) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.location = location;
    }

    // Getters

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getLocation() {
        return location;
    }

    // Setters

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Display Method

    public void displayDepartment() {

        System.out.println("----------------------------------");
        System.out.println("Department ID   : " + departmentId);
        System.out.println("Department Name : " + departmentName);
        System.out.println("Location        : " + location);
        System.out.println("----------------------------------");
    }
}