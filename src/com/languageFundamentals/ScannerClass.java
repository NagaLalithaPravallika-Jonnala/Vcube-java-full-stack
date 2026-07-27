package com.languageFundamentals;
import java.util.Scanner;
public class ScannerClass {
	void name(String fullName,String firstName,String lastName) {
	    System.out.println("Full Name : " + fullName);
	    System.out.println("First Name : " + firstName);
	    System.out.println("Last Name : " + lastName);
	}
	
	void fatherName(String firstName1,String lastName1 ) {
		System.out.println("First Name : " + firstName1);
		System.out.println("Last Name : " + lastName1);
	}

	public static void main(String[] args) {
		ScannerClass s1=new ScannerClass();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Full Name : ");
		String fullName = sc.nextLine();
		
		System.out.println("Enter the First Name : ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter the last Name : ");
		String lastName = sc.nextLine();
		
		System.out.println("Enter the Fathers First Name : ");
		String firstName1 = sc.nextLine();
		
		System.out.println("Enter the Fathers Last Name : ");
		String lastName1 = sc.nextLine();
		
		
		sc.nextLine();
		s1.name(fullName,firstName,lastName);
	
		
		sc.nextLine();
		s1.fatherName(firstName1, lastName1);
	}

}
