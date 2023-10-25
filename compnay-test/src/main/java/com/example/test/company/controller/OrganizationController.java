package com.example.test.company.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.test.company.model.Organization;
import com.example.test.company.service.OrganizationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1/organization")
@CrossOrigin

public class OrganizationController {
	@Autowired
	private OrganizationService organizationService;
	
	@GetMapping
	public ResponseEntity<List<Organization>> getAllOrganization(){
		return new ResponseEntity<List<Organization>> (organizationService.getAllOrganization() , HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization) {
	    Organization createdOrganization = organizationService.createOrganization(organization);
	    return ResponseEntity.status(HttpStatus.CREATED).body(createdOrganization);
	}

	
	
	

}
