package com.jbk.model;

public class Branch {
	private String branchid;
	private String branchname;
	private String branchcode;
	@Override
	public String toString() {
		return "Branch [branchid=" + branchid + ", branchname=" + branchname + ", branchcode=" + branchcode + "]";
	}
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(String branchid, String branchname, String branchcode) {
		super();
		this.branchid = branchid;
		this.branchname = branchname;
		this.branchcode = branchcode;
	}
	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getBranchcode() {
		return branchcode;
	}
	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}


}
