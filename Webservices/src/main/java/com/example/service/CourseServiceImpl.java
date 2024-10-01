package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Courses;

@Service
public class CourseServiceImpl implements ICourseService {
	
	List<Courses> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Courses(111, "Java Course", "This course contains basics of java"));
		list.add(new Courses(222, "Python Course", "This course contains basics of python"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
