package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Student;

public interface studentdao {
	public Student savestudent(Student student);
	public Student getstudent(String studentid);
	public List<Student> getallstudent();
	public boolean deletestudentbyid(String studentid);
	public Student updatestudent(Student student);


}
