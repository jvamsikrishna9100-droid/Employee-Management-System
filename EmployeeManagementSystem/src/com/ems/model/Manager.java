package com.ems.model;

public class Manager extends Employee {

    // Additional Instance Variable
    private int teamSize;

    // Default Constructor
    public Manager() {

    }

    // Parameterized Constructor
    public Manager(int employeeId, String employeeName, int age,
                   String gender, String designation, double salary,
                   String phoneNumber, String email,
                   int departmentId, int teamSize) {

        super(employeeId, employeeName, age, gender, designation,
              salary, phoneNumber, email, departmentId);

        this.teamSize = teamSize;
    }

    // Getter

    public int getTeamSize() {
        return teamSize;
    }

    // Setter

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // Method Overriding
    @Override
    public void displayEmployee() {

        super.displayEmployee();
        System.out.println("Team Size       : " + teamSize);
        System.out.println("-----------------------------------------");
    }
}