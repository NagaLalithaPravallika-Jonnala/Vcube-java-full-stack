package com.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("Enter a number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter another number : ");
		int n2 = sc.nextInt();
		try {
			System.out.println("in try");
			System.out.println(n1/n2);
		}catch(Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		System.out.println("Main method ended ");
	}

}
