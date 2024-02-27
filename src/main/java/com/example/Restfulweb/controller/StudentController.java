package com.example.Restfulweb.controller;

import com.example.Restfulweb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;



	@RequestMapping("/students")
	public List<Student> getStudents() {

		return studentService.getStudents();

	}

	@RequestMapping("/students/{id}")
	public Student findStudent(@PathVariable int id){//in url path there's a variable

		return studentService.findStudent(id);

	}
}