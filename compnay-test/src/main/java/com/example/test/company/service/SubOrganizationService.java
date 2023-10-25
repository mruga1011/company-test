package com.example.test.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.company.model.SubOrganization;
import com.example.test.company.repository.SubOrganizationRepo;

@Service
public class SubOrganizationService {
	@Autowired
	private SubOrganizationRepo subOrganizationRepo;
	
	public List<SubOrganization> getAllSubOrganization(){
		return subOrganizationRepo.findAll();
	}
	
	public SubOrganization createSubOrganization(SubOrganization subOrganization) {
		return subOrganizationRepo.save(subOrganization);
	}

}
