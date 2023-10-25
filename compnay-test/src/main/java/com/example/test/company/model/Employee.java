package com.example.test.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Email(message = "Enter valid email")
	private String email;
	@Size(min = 10 , max=10)
	private String number;
	@Min(value = 18 ,message = "age must be above 18")
	private int age;
	
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role role ;
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	@ManyToOne
	@JoinColumn(name = "subId")
	private SubOrganization subOrganization;
	
	
	
	
	
	public SubOrganization getSubOrganization() {
		return subOrganization;
	}
	public void setSubOrganization(SubOrganization subOrganization) {
		this.subOrganization = subOrganization;
	}
	
	@ManyToOne
	@JoinColumn(name = "deptId")
	private Department department;
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
