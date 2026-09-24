package com.ExceptionHandling;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
		System.out.println("Main Method Started ");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a String : ");
			String a = sc.next();
			System.out.println("in try");
			double d = Integer.parseUnsignedInt(a);
		}catch(Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		System.out.println("Main Method Ended ");
		

	}

}
