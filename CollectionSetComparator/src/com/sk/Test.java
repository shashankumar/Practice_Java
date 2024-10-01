package com.sk;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
	
	Employee emp1=new Employee(1, "Shashank");
	Employee emp2=new Employee(2, "Anuradha");
	Employee emp3=new Employee(3, "Ankur");
	Employee emp4=new Employee(4, "Sonal");
	
	 HashSet<Employee> hs= new HashSet<>();
	 
	 TreeSet<Employee> ts= new TreeSet<>();
	
	public HashSet<Employee> addEmployees(){
		HashSet<Employee> hs= new HashSet<>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		return hs;
	}
	public TreeSet<Employee> addEmployeesinTree(){
		HashSet<Employee> hs= new HashSet<>();
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp4);
		return ts;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t= new Test();
		HashSet<Employee> employees = t.addEmployees();
		System.out.println(employees);
		
		TreeSet<Employee> tree = t.addEmployeesinTree();
		System.out.println(tree);

	}

}
