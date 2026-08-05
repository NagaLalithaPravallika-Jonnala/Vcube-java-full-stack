package com.CaseStudies;
import java.util.Scanner;
public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employe Rating :");
		int rating = sc.nextInt();
	    String Status = (rating >=4) ? "Eligible for Bonus " : "Not Eligible for Bonus";
        System.out.println(Status);
	}

}
