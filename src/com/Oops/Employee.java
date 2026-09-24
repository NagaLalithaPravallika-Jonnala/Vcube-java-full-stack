package com.Oops;
//DTO: Data Transfer Object
//POJO: Plain Old Java Object
//MOdel: Data Model
public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	
	
	public void setEmpId(int empId){
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpName(String EmpName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public double getEmpSalary() {
		return empSalary;
	}

}
