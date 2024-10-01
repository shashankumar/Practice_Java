package com.sk;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
	
public void sortById() {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Shashank1");
		Employee emp2 = new Employee();
		emp2.setId(11);
		emp2.setName("Shashank11");
		Employee emp3 = new Employee();
		emp3.setId(111);
		emp3.setName("Shashank111");
		Employee emp4 = new Employee();
		emp4.setId(1111);
		emp4.setName("Shashank1111");
		
		Student s1 = new Student();
		s1.setSid(1);
		s1.setName("Anshu");
		Student s2 = new Student();
		s2.setSid(2);
		s2.setName("Shashank");
		Student s3 = new Student();
		s3.setSid(3);
		s3.setName("Anuadha");
				
		TreeSet<Employee> t = new TreeSet<>(new myComparator());
		t.add(emp1);
		t.add(emp2);
		t.add(emp3);
		t.add(emp4);
		System.out.println(t);
		
		TreeSet<Student> t1 = new TreeSet<>(new mySComparator());
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		System.out.println(t1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.sortById();
		

	}

}
class myComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int id1 = o1.getId();
		int id2 = o2.getId();
		if (id1<id2) {
			return +100;
		}else if(id1>id2) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
class mySComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		String len1 = o1.getName().toString();
		String len2 = o2.getName().toString();
		
		return len1.compareTo(len2);
		
	}

	
	
	
	
}
