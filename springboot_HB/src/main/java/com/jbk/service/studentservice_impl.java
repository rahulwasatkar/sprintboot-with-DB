package com.jbk.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.studentdao;
import com.jbk.entity.Student;

@Service
public class studentservice_impl implements studentservice {
	@Autowired
	studentdao dao;

	@Override
	public Student savestudent(Student student) {

		String studentId = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		student.setStudentid(studentId);
		Student std = dao.savestudent(student);

		return std;
	}

	@Override
	public Student getstudent(String studentid) {
		Student student = dao.getstudent(studentid);

		return student;
	}

	@Override
	public List<Student> getallstudent() {
		List<Student> student = dao.getallstudent();
		return student;
	}

	@Override
	public boolean deletestudentbyid(String studentid) {
boolean b = dao.deletestudentbyid(studentid);
		return b;
	}

	@Override
	public Student updatestudent(Student student) {
		Student std = dao.updatestudent(student);
		return std;
	}

}
