package com.languageFundamentals;
import java.util.Scanner;
public class MyInfo2 {
	void displayStudent(String name) {
		
	    System.out.println("My name is : " + name);
		
	}
	void calculateTotal(int m1,int m2,int m3)
	{
		int total=m1+m2+m3;
		System.out.println("Total Marks :" + total);
	}
	void average(double m1,double m2, double m3) {
		double avg=((m1+m2+m3)/3);
	    System.out.println("The Average value is : " + avg);
	}

	 void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = sc.next();
	    displayStudent(name);
	    System.out.println("Enter the First Value : ");
	    int m1 = sc.nextInt();
	    System.out.println("Enter the Second Value : ");
		int m2 = sc.nextInt();
		System.out.println("Enter the Third Value : ");
		int m3 = sc.nextInt();
	    calculateTotal(m1,m2,m3);
        average(m1,m2,m3);
	}

}
