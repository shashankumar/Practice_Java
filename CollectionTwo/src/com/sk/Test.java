package com.sk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
	Employee emp1 = new Employee(1, "Shashank");
	Employee emp2 = new Employee(2, "Anuradha");
	Employee emp3 = new Employee(3, "Anushaka");
	Employee emp4 = new Employee(4, "Ankur");

	ArrayList<Employee> al = new ArrayList<Employee>();

	public void getName(int a) {
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		Employee employee = al.get(a);
		System.out.println(employee.getId() + " " + employee.getName());
	}

	public void add(int id, String name) {
		Employee emp = new Employee(id, name);
		LinkedList<Employee> l=new LinkedList<>(al);
		boolean b = l.add(emp);
		System.out.println(b);
		System.out.println(l);

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give ADD or INSERT:");
		String v = br.readLine();
		System.out.println(v);
		if(v.equals("ADD")) {
			System.out.println("Give id:");
			int x = Integer.parseInt(br.readLine());
			System.out.println("Give Name:");
			String y = (br.readLine());
			Test t = new Test();
			t.add(x, y);
		
		}
		  else {
		  
		  System.out.println("Give no for getting attributes from Employee:");
		  int line = Integer.parseInt(br.readLine()); 
		  Test t = new Test(); t.getName(line);
		  
		  }
		 

	}

}
