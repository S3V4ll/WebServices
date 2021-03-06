package com.montrealcollege.exercise5rest.service;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montrealcollege.exercise5rest.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, 
					produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		student.setRegistrationDate(LocalDate.now());
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

}
