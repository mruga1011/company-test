package com.example.test.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.company.model.Department;
import com.example.test.company.repository.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	public List<Department> getAllDepartment(){
		return departmentRepo.findAll();
	}
	
	public Department createDepartment(Department department) {
		return departmentRepo.save(department);
		
	}
	public Department updateDepartment(Department department , int id) {
		if(departmentRepo.existsById(id)) {
			department.setDeptId(id);
			return departmentRepo.save(department);
		}
		return null;
		
		
	}
	
	public void deleteDepartment(int id) {
		departmentRepo.deleteById(id);
	}
	
	
	

	
}
