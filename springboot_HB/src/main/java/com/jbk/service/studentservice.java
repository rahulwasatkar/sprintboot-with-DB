package com.jbk.service;

import java.util.List;

import com.jbk.entity.Student;
import com.jbk.model.Branch;
import com.jbk.model.Student_Branch;

public interface studentservice {
	public Student savestudent(Student student);
	public Student getstudent(String studentid);
	public List<Student> getallstudent();
	public boolean deletestudentbyid(String studentid);
	public Student updatestudent(Student student);
  public Branch getbranchbyid (String branchid);
 public Student_Branch getstudentwithbranch(String studentid);
 public List<Student_Branch> getallstudentwithbranch();
}
