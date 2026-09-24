package com.ExceptionHandling;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {
		System.out.println(" Main Method Started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount : ");
		int amount = sc.nextInt();
		System.out.println("Enter Withdraw amount : ");
		double withDrawAmount = sc.nextDouble();
		try {
			System.out.println("in try");
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		System.out.println(" Main Method Ended ");

	}

}
