package com.basics;

public class Employee2 {
	Integer EmployeeId =12;
	String EmployeeGrade = "A-Grade";
	Double EmployeeSalary = 20000.0;
	String EmployeeStatus ="Active";
	Integer EmployeeExperience =2;
	Integer EmployeeWorkingDays =29;
	Long EmployeePhoneNumber=2345234667l;
	Double EmployeeBonusAmount =5000.0;

	public static void main(String[] args) {
		
		Employee2 e1=new Employee2();
	    System.out.println("Employee Id : " + e1.EmployeeId);
	  
	    System.out.println("Employee Grade : " + e1.EmployeeGrade);
	 
	    System.out.println("Employee Salary : " + e1.EmployeeSalary);
	   
	    System.out.println("Employee Status : " + e1.EmployeeStatus);
	    
	    System.out.println("Employee Experience : " + e1.EmployeeExperience);
	  
	    System.out.println("Employee Working Days : " + e1.EmployeeWorkingDays);
	    
	    System.out.println("Employee Phone Number : " + e1.EmployeePhoneNumber);
	    
	    System.out.println("Employee Bonus Amount : " + e1.EmployeeBonusAmount);
	}

}
