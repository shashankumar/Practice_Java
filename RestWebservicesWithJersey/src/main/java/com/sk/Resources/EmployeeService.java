package com.sk.Resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sk.model.Employee;

public class EmployeeService {
	
	Employee emp4 = new Employee(1, "Shashank1");
	Employee emp1 = new Employee(2, "Shashank2");
	Employee emp2 = new Employee(3, "Shashank3");
	Employee emp3 = new Employee(4, "Shashank4");
	
	
	public List<Employee> addemp() {
		return Arrays.asList(emp1,emp2,emp3,emp4);
	}
	
	
	public Employee getEmpById(int id) {
		List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4);
		Employee employee = list.get(id);
		return employee;
	}

}
