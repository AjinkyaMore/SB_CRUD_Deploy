package com.adhyayan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adhyayan.model.Student;
import com.adhyayan.servicei.StudentServiceI;

@RestController
public class StudentController
{
	@Autowired
	StudentServiceI si;
	
	@GetMapping({"/","/home","/status"})
	public String homePage()
	{
		return "Home Page";
	}
	
	@GetMapping("/getAllStudents")
	public Iterable<Student> getAllStudents()
	{
		return si.getAllStudents();
	}
	
}
