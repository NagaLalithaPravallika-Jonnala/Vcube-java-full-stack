package com.basics;

public class Employee {
	static String companyName;
	static String location;
	String employeeName;
	int salary;
	static {
		companyName="Wipro";
	    location="hyderabad";
		
	}

	public static void main(String[] args) {
		System.out.println("Company Name : " + companyName);
		System.out.println("Location : " + location);
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.employeeName="Pravallika";
		e2.salary=30000;
		System.out.println("Employee Name : " + e1.employeeName);
		System.out.println("Salary : " + e2.salary);
		

	}


}
