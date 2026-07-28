package com.languageFundamentals.Constructors;

public class Employee {
	int empId;
	String empName;
	double salary;
	
	Employee(int empId,String empName,double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		show();
	}
	Employee(Employee e){
		this.empId=e.empId;
		this.empName=e.empName;
		this.salary=e.salary;
		show();
	}
    void show() {
    	System.out.println("Employee Id : " + empId);
    	System.out.println("Employee Name : " + empName);
    	System.out.println("Employee Salary : " + salary);
    }
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Krishna",4000.0);
		Employee e2 = new Employee(e1);
		e2.empName="Hari";
		e2.salary=4567;
		e1.show();
		System.out.println("**************************");
		
		e2.show();
	}

}
