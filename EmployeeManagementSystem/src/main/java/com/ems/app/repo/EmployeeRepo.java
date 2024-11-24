package com.ems.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.app.pojo.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
