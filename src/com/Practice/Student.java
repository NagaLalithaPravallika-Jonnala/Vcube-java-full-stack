package com.Practice;
import java.util.Scanner;
public class Student {
    int studentId;
    String studentName;
    String studentAdress;
    int studentAge;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Id : " );
		int studentId = sc.nextInt();
		System.out.println("Enter the Student Name : ");
        String studentName = sc.next();
        System.out.println("Enter the Student Adress : ");
        String studentAdress = sc.next();
        System.out.println("Enter the Student age : ");
        int studentAge = sc.nextInt();
        System.out.println("Enter the Student Id : " + studentId );
        System.out.println("Enter the Student Name : " + studentName);
        System.out.println("Enter the Student Adress : " + studentAdress);
        System.out.println("Enter the Student age : " + studentAge);
        
	}

}
