package com.languageFundamentals;
import java.util.Scanner;
public class EmployeeSalary {
	void salarySlip(String employeeName,double basicSalary) {
		double hra=basicSalary*20/100;
		System.out.println("To display HRA : " + hra);
		double da=basicSalary*10/100;
		System.out.println("To display DA : " + da);
		double grossSalary=basicSalary+(hra)+(da);
		System.out.println("To display Gross Salary : " + grossSalary );
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeSalary e=new EmployeeSalary();
		System.out.println("Enter the Employee Name : " );
        String employeeName=sc.next();
        System.out.println("Enter the Basic Salary : " );
        double basicSalary=sc.nextDouble();
        e.salarySlip(employeeName,basicSalary);
              
	}

}
