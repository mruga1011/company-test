package com.example.test.company.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Organization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int organizationId;
	private String name ;
	private String description;
	private String founder;
	
	@OneToMany(mappedBy = "organization" , cascade = CascadeType.ALL)
	   private List<SubOrganization> subOrganization;

	public List<SubOrganization> getSubOrganization() {
		return subOrganization;
	}
	public void setSubOrganization(List<SubOrganization> subOrganization) {
		this.subOrganization = subOrganization;
	}
	public int getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	
	
	

}
