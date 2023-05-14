package com.Technosignia.HRMS.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.HRMS.Entity.Employee;
import com.Technosignia.HRMS.Service.EmployeeService;

@RestController
public class EmployeeController {
     
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/employee")
	public Optional<Employee> findEmployeeById(@RequestParam Long id){
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployeeById(@RequestParam Long id ,@RequestBody Employee employee)
	{
		return employeeService.editEmployeeById(id,employee);
	}
	
	@DeleteMapping("/employee")
	public String deleteEmp(@RequestParam Long id)
	{
		return employeeService.removeAddressById(id);
	}
	
}
