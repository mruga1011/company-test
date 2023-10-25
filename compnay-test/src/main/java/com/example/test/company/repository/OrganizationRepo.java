package com.example.test.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.company.model.Organization;
@Repository
public interface OrganizationRepo extends JpaRepository<Organization , Integer> {
	
	
	

}
