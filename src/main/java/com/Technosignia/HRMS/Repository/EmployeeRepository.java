package com.Technosignia.HRMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Technosignia.HRMS.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
