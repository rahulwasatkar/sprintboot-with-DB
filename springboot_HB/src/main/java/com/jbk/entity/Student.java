package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	private String studentid;
	private String studentname;
	private long marks;
	private String branchid;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentid, String studentname, long marks, String branchid) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.marks = marks;
		this.branchid = branchid;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}

	@Override 
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", marks=" + marks + ", branchid="
				+ branchid + "]";
	}
	
}
