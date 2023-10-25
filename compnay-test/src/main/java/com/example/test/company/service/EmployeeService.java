package com.example.test.company.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.company.model.Employee;
import com.example.test.company.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	

   public Employee createEmployee(Employee employee) {
	return employeeRepo.save(employee);
	   
   }
   
   public List<Employee> getAllEmployee(){
	   return employeeRepo.findAll();
	   
   }
   
   public  Employee updateEmployee(int id , Employee employee) {
	   if(employeeRepo.existsById(id)) {
		   employee.setId(id);
		   return employeeRepo.save(employee);
	   }
	   return null;
   }
   
   public void deleteEmployee(int id) {
	   employeeRepo.deleteById(id);
   }
}
