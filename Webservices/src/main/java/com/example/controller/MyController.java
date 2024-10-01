package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Courses;
import com.example.service.ICourseService;

@RestController
public class MyController {
	@Autowired
	private ICourseService service;
	
	@GetMapping("/home")
	public String home() {
		// TODO Auto-generated method stub
		return "This is home Shashank!";

	}
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.service.getCourses();
	}

}
