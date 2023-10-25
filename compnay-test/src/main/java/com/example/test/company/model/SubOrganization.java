package com.example.test.company.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class SubOrganization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int sId;
	private String name;
	private String misssion;
	
	
	@ManyToOne
	@JoinColumn(name = "organizationId")
	private Organization organization;
	
	
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
		
	}
	
	@OneToMany(mappedBy = "subOrganization" , cascade = CascadeType.ALL)
	  private List<Employee> employee;
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMisssion() {
		return misssion;
	}
	public void setMisssion(String misssion) {
		this.misssion = misssion;
	}
	
	

}
