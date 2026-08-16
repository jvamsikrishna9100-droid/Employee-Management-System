package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ems.database.DBConnection;
import com.ems.model.Employee;

public class EmployeeDAO implements EmployeeOperations {

	private Connection connection;

	public EmployeeDAO() {
		connection = DBConnection.getConnection();
	}

	@Override
	public boolean addEmployee(Employee employee) {

		String sql = "INSERT INTO employee(employee_name, age, gender, designation, salary, phone_number, email, department_id) VALUES(?,?,?,?,?,?,?,?)";

		try {

			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, employee.getEmployeeName());
			ps.setInt(2, employee.getAge());
			ps.setString(3, employee.getGender());
			ps.setString(4, employee.getDesignation());
			ps.setDouble(5, employee.getSalary());
			ps.setString(6, employee.getPhoneNumber());
			ps.setString(7, employee.getEmail());
			ps.setInt(8, employee.getDepartmentId());

			int rows = ps.executeUpdate();

			return rows > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> employeeList = new ArrayList<>();

		String sql = "SELECT * FROM employee";

		try {

			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Employee employee = new Employee();

				employee.setEmployeeId(rs.getInt("employee_id"));
				employee.setEmployeeName(rs.getString("employee_name"));
				employee.setAge(rs.getInt("age"));
				employee.setGender(rs.getString("gender"));
				employee.setDesignation(rs.getString("designation"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setPhoneNumber(rs.getString("phone_number"));
				employee.setEmail(rs.getString("email"));
				employee.setDepartmentId(rs.getInt("department_id"));

				employeeList.add(employee);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@Override

	public Employee getEmployeeById(int employeeId) {

	    String sql = "SELECT * FROM employee WHERE employee_id = ?";

	    try {

	        PreparedStatement ps = connection.prepareStatement(sql);

	        ps.setInt(1, employeeId);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {

	            Employee employee = new Employee();

	            employee.setEmployeeId(rs.getInt("employee_id"));
	            employee.setEmployeeName(rs.getString("employee_name"));
	            employee.setAge(rs.getInt("age"));
	            employee.setGender(rs.getString("gender"));
	            employee.setDesignation(rs.getString("designation"));
	            employee.setSalary(rs.getDouble("salary"));
	            employee.setPhoneNumber(rs.getString("phone_number"));
	            employee.setEmail(rs.getString("email"));
	            employee.setDepartmentId(rs.getInt("department_id"));

	            return employee;
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return null;
	}
	@Override
	public boolean updateEmployee(Employee employee) {

	    String sql = "UPDATE employee SET employee_name=?, age=?, gender=?, designation=?, salary=?, phone_number=?, email=?, department_id=? WHERE employee_id=?";

	    try {

	        PreparedStatement ps = connection.prepareStatement(sql);

	        ps.setString(1, employee.getEmployeeName());
	        ps.setInt(2, employee.getAge());
	        ps.setString(3, employee.getGender());
	        ps.setString(4, employee.getDesignation());
	        ps.setDouble(5, employee.getSalary());
	        ps.setString(6, employee.getPhoneNumber());
	        ps.setString(7, employee.getEmail());
	        ps.setInt(8, employee.getDepartmentId());
	        ps.setInt(9, employee.getEmployeeId());

	        return ps.executeUpdate() > 0;

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return false;
	}
	@Override
	public boolean deleteEmployee(int employeeId) {

	    String sql = "DELETE FROM employee WHERE employee_id=?";

	    try {

	        PreparedStatement ps = connection.prepareStatement(sql);

	        ps.setInt(1, employeeId);

	        return ps.executeUpdate() > 0;

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return false;
	}
	

}