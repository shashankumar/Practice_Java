package com.sk.model;

import org.springframework.hateoas.RepresentationModel;

public class Users extends RepresentationModel {
	
	
	private String name;
	private Long Salary;
	public Users(String name, Long salary) {
		super();
		this.name = name;
		Salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	

}
