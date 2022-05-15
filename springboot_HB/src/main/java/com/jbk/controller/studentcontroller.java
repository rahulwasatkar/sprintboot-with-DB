package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.jbk.entity.Student;
import com.jbk.service.studentservice;

@RestController
public class studentcontroller {
	@Autowired
	private studentservice service;
	
	@PostMapping(value = "/savestudent")
	public ResponseEntity<Student> savestudent(@RequestBody Student student){
		Student std = service.savestudent(student);
		
		if(std!=null) {
		return new ResponseEntity<>(std,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
	@GetMapping(value = "/getstudentbyid/{studentid}")
	public ResponseEntity<Student> getstudent(@PathVariable String studentid) {
		Student student = service.getstudent(studentid);
		if(student!=null) {
			return new ResponseEntity<>(student,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				
			}

	}
}
