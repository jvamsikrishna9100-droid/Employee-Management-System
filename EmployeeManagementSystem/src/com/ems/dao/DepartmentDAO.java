package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ems.database.DBConnection;
import com.ems.model.Department;

public class DepartmentDAO implements DepartmentOperations {

    private Connection connection;

    public DepartmentDAO() {
        connection = DBConnection.getConnection();
    }

    @Override
    public boolean addDepartment(Department department) {

        String sql = "INSERT INTO department(department_name, location) VALUES(?, ?)";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, department.getDepartmentName());
            ps.setString(2, department.getLocation());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<Department> getAllDepartments() {

        List<Department> departmentList = new ArrayList<>();

        String sql = "SELECT * FROM department";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Department department = new Department();

                department.setDepartmentId(rs.getInt("department_id"));
                department.setDepartmentName(rs.getString("department_name"));
                department.setLocation(rs.getString("location"));

                departmentList.add(department);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departmentList;
    }

    @Override
    public Department getDepartmentById(int departmentId) {

        String sql = "SELECT * FROM department WHERE department_id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, departmentId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Department department = new Department();

                department.setDepartmentId(rs.getInt("department_id"));
                department.setDepartmentName(rs.getString("department_name"));
                department.setLocation(rs.getString("location"));

                return department;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean updateDepartment(Department department) {

        String sql = "UPDATE department SET department_name=?, location=? WHERE department_id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, department.getDepartmentName());
            ps.setString(2, department.getLocation());
            ps.setInt(3, department.getDepartmentId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteDepartment(int departmentId) {

        String sql = "DELETE FROM department WHERE department_id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, departmentId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}