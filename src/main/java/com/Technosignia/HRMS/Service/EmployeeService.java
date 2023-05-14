package com.Technosignia.HRMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.HRMS.Entity.Employee;
import com.Technosignia.HRMS.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
    @Autowired
	EmployeeRepository employeeRepository;
    
	public Employee createEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	

	public Optional<Employee> getEmployeeById(Long id) {
		
		return employeeRepository.findById(id);
	}




	public Employee editEmployeeById(Long id, Employee employee) {
		Optional<Employee> op= employeeRepository.findById(id);
		    Employee dbemp = op.get();
		    
		    if(employee.getAddress()!=null)
		    dbemp.setAddress(employee.getAddress());
		    
		    if(employee.getContact()!=null)
		    dbemp.setContact(employee.getContact());
		    
		    if(employee.getDept()!=null)
		    dbemp.setDept(employee.getDept());
		    
		    if(employee.getName()!=null)
		    dbemp.setName(employee.getName());
		    
		    if(employee.getSalary()!=null)
		    dbemp.setSalary(employee.getSalary());
		    
		    return employeeRepository.save(dbemp);
	}



	public  String removeAddressById(Long id) {
		
		 employeeRepository.deleteById(id);
		 return "one employee record is deleted";
	}
}
