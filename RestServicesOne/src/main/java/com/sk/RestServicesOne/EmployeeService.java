package com.sk.RestServicesOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
	
	Employee emp1 = new Employee(1,"Shashank","Lucknow");
	Employee emp2 = new Employee(2,"Rohan","Delhi");
	Employee emp3 = new Employee(3,"Mohan","Mumbai");
	
	static HashMap<Integer, Employee> hs = new HashMap<Integer, Employee>();
	
	
	
	public List<Employee> getAllEmployee(){
		//return Arrays.asList(emp1,emp2,emp3);
		System.out.println(hs.values());
		return  new ArrayList(hs.values());
	}
	
	public void addEmp() {
		/*
		 * Map<Integer, Employee> employee = InMemoryDB.getEmployee();
		 * emp.setId(employee.size()+1); Employee e = employee.put(emp.getId(), emp);
		 * //System.out.println(e.getId()); return e;
		 */
		/*
		 * hs.put(emp1.getId(), emp1); hs.put(emp2.getId(), emp2); hs.put(emp3.getId(),
		 * emp3); System.out.println(hs);
		 */
		
		
	}
	public Employee addEmps(Employee emp) {
		int size = hs.size();
		emp.setId(size+1);;
		 hs.put(size+1, emp);
		return emp;
	}

}
