package com.LogicalStatements;
import java.util.Scanner;
// write a java program to find the grade based on marks percentage
public class GradeMarks {
   static String grade;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks :  ");
		double marks = sc.nextDouble();
		
		if(marks>100 || marks<0) {
			System.out.println("Invalid Marks Percentage ");
		}
		else if(marks>=90) {
			grade = "Excellent - A";
		}
		else if(marks>=80) {
			grade = "Good - B";
		}
		else if(marks>=70) {
			grade = "Avg - C";
		}
		else if(marks>=60) {
			grade = "Satisfactory - D";
		}
		else if(marks<=35) {
			grade = "Just Passed - P";
		}
		else {
			grade = "Failed - F";
		}
		System.out.println("Student Grade based on his marks percentage : " + grade);
	}

}
