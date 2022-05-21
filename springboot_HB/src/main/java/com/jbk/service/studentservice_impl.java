package com.jbk.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jbk.dao.studentdao;
import com.jbk.entity.Student;
import com.jbk.model.Branch;
import com.jbk.model.Student_Branch;

@Service
public class studentservice_impl implements studentservice {
	@Autowired
	studentdao dao;
	@Autowired
	private RestTemplate restTemplate;

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

	@Override
	public Branch getbranchbyid(String branchid) {
		Branch branch = restTemplate.getForObject("http://localhost:8081/branch/getbranchbyid/" + branchid,
				Branch.class);
		return branch;
	}

	@Override
	public Student_Branch getstudentwithbranch(String studentid) {
		Student_Branch student_branch = new Student_Branch();
		Student student = getstudent(studentid);
		if (student != null) {
			Branch branch = getbranchbyid(student.getBranchid());

			student_branch.setStudent(student);
			student_branch.setBranch(branch);
			return student_branch;
		} else {
			return null;

		}
	}

	@Override
	public List<Student_Branch> getallstudentwithbranch() {
		List<Student_Branch> student_branch_list = new ArrayList<>();
		
	List<Student> studentlist =	getallstudent();
	for (Student student : studentlist) {
		Student_Branch student_branch = new Student_Branch();
		Branch branch= getbranchbyid(student.getBranchid());
		student_branch.setStudent(student);
		student_branch.setBranch(branch);
		student_branch_list.add(student_branch);
		
	}
	return student_branch_list;	
	}

}
