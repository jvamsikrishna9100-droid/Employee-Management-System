package com.ems.dao;

import java.util.List;
import com.ems.model.Department;

public interface DepartmentOperations {

    boolean addDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(int departmentId);

    boolean updateDepartment(Department department);

    boolean deleteDepartment(int departmentId);
}