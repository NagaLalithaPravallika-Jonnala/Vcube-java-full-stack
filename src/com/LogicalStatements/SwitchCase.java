package com.LogicalStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn = " ";

		do {
			System.out.println("Enter Month : ");
			String months = sc.next();
			switch (months) {
			case "1" -> System.out.println("January");
			case "2" -> System.out.println("Feb");
			case "3" -> System.out.println("Mar");
			case "4" -> System.out.println("April");
			case "5" -> System.out.println("May");
			case "6" -> System.out.println("June");
			case "7" -> System.out.println("July");
			case "8" -> System.out.println("Aug");
			case "9" -> System.out.println("Sep");
			case "10" -> System.out.println("Oct");
			case "11" -> System.out.println("Nov");
			case "12" -> System.out.println("Dec");

			default -> System.out.println("Invalid Month");
			}
			System.out.println("Do you want to continue ? (Y/N)");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		
		System.out.println("Exit");
	}

}