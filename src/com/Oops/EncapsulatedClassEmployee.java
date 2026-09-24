package com.Oops;

public class EncapsulatedClassEmployee {
	private int eid;
	private String ename;
	private double salary;
	private String password;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public double getsalary() {
		return salary;
	}
	public void setPassword() {
		this.password =password;
	}
	public String getPassword() {
		return password;
	}
}
