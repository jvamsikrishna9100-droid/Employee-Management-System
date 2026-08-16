package com.ems.model;

public class Developer extends Employee {

    // Additional Instance Variable
    private String programmingLanguage;

    // Default Constructor
    public Developer() {

    }

    // Parameterized Constructor
    public Developer(int employeeId, String employeeName, int age,
                     String gender, String designation, double salary,
                     String phoneNumber, String email,
                     int departmentId, String programmingLanguage) {

        super(employeeId, employeeName, age, gender, designation,
              salary, phoneNumber, email, departmentId);

        this.programmingLanguage = programmingLanguage;
    }

    // Getter

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Setter

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // Method Overriding
    @Override
    public void displayEmployee() {

        super.displayEmployee();
        System.out.println("Programming Language : " + programmingLanguage);
        System.out.println("-----------------------------------------");
    }
}