package com.example.test.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import com.example.test.company.model.Organization;
import com.example.test.company.repository.OrganizationRepo;

@Service
public class OrganizationService {
	
	
	@Autowired
	private OrganizationRepo organizationRepo;
	
	public List <Organization> getAllOrganization(){
		return organizationRepo.findAll();
		
	}
	
	  public Organization createOrganization(Organization organization) {
	        return organizationRepo.save(organization);
	

  }

}

