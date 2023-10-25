package com.example.test.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.company.model.SubOrganization;
import com.example.test.company.service.SubOrganizationService;

@RestController
@RequestMapping("/api/v1/sub")
public class SubOrganizationController {
	
	@Autowired
	private SubOrganizationService subOrganizationService;
	
    @GetMapping
    public ResponseEntity<List<SubOrganization>> getAllSubOrganizations() {
      return new ResponseEntity<List<SubOrganization>>(subOrganizationService.getAllSubOrganization() , HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<SubOrganization> createSubOrganization(@RequestBody SubOrganization subOrganization){
    	return new ResponseEntity<SubOrganization>(subOrganizationService.createSubOrganization(subOrganization) , HttpStatus.CREATED);
    }


}
