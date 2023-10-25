package com.example.test.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.company.model.Department;
import com.example.test.company.service.DepartmentService;

@RestController
@RequestMapping("/api/v1/depart")
public class DepartMentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	public ResponseEntity<List<Department>> getAllDepartment(){
		return new ResponseEntity<> (departmentService.getAllDepartment() , HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<Department> createDepartment(@RequestBody Department department){
		return new ResponseEntity<Department>(departmentService.createDepartment(department) , HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Department> updateDepartment(@RequestBody Department department , @PathVariable int id){
		return new ResponseEntity<Department>(departmentService.updateDepartment(department, id) , HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteDepartment(@PathVariable int id){
		departmentService.deleteDepartment(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
	
	

}
