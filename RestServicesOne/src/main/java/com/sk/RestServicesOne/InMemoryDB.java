package com.sk.RestServicesOne;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDB {
	int id;
	Employee emp = new Employee(1,"Shashank","Deoria");
	public static Map<Integer, Employee> employee= new HashMap<>();
	
	public static Map<Integer, Employee> getEmployee() {
		
		return employee;
	}
	
	public void print() {
		System.out.println(employee);
	}

}
