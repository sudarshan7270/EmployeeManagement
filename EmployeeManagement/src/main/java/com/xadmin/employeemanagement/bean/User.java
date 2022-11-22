package com.xadmin.employeemanagement.bean;

public class User {
	private int eid;
	private String ename;
	private int doj;
	private int yoe;
	private String designation;
	
	public User(String ename, int doj, int yoe, String designation) {
		super();
		this.ename = ename;
		this.doj = doj;
		this.yoe = yoe;
		this.designation = designation;
	}
	public User(int eid, String ename, int doj, int yoe, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.doj = doj;
		this.yoe = yoe;
		this.designation = designation;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public int getYoe() {
		return yoe;
	}
	public void setYoe(int yoe) {
		this.yoe = yoe;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
