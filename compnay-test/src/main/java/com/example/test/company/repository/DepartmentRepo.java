package com.example.test.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.company.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department , Integer> {
	

}
