package com.languageFundamentals.Operator;
import java.util.Scanner;
//? :
//	write a program to find the minimum number from  given two numbers...?
//	Write a program the given number is even or odd...?
//	Write a program to find pass or fail based on marks...?
//	Write a program to find the maximum number from a given three numbers...?
//  Syntax : (Condition)?statement1:statement2;
public class TernaryOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value : ");
		int a = sc.nextInt();
		System.out.println("Enter the b value : ");
		int b = sc.nextInt();
		int min = (a>b) ? a : b;
//		System.out.println("Minimum number is : " + min);
		System.out.println("Maximum number is : " + min);
	}

}
