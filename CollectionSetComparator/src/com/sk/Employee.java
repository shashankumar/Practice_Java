package com.sk;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.name.compareTo(o.name)!=0) {
			return this.name.compareTo(o.name);
		}
		return id;
	}
	
	

}
