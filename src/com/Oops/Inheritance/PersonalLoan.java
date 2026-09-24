package com.Oops.Inheritance;

import java.util.Scanner;

public class PersonalLoan {
	static Scanner sc = new Scanner(System.in);

	boolean isPhoneValid() {
		System.out.println("Enter your mobile number");
		String phone = sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}

	boolean isAadharValid() {
		System.out.println("Enter your aadhar ");
		String aadhar = sc.next();
		return aadhar.matches("[1-9]{1}[0-9]{11}");
	}

	boolean isPanValid() {
		System.out.println("Enter PAN card details : ");
		String pan = sc.next();
		return pan.matches("[A-Z]{S}[0-9}{4}[A-z]{1}");
	}

	double getLoanROI() {
		double roi = 8.5;
		int cibil = getCibilScore();
		if (cibil >= 300 && cibil <= 549) {
			System.out.println("Poor - High Risk , Loan applications are likely to be rejected");
			roi = roi + 4.0;
		} else if (cibil >= 550 && cibil <= 699) {
			System.out.println("Fair - Moderate risk;may face limitations incredit approval");
			roi = roi + 3.0;
		} else if (cibil >= 700 && cibil <= 749) {
			System.out.println("Good - Low risk ,Better chances of loan approval with favorable terms");
			roi = roi + 1.5;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println("Excellent - very low risk , Highest likelihood of approval");
			roi = roi + 0.5;
		} else {
			System.out.println("Invalid cibil Information");
			roi = roi + 10.5;
		}
		return roi;
	}

	int getCibilScore() {
		System.out.println("Enter your cibil score : ");
		int cibilScore = sc.nextInt();
		return cibilScore;
	}

	double getCustomerSalary() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	int getCustomerAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println("Welcome to ABC Personal Loan Banking !!");
		PersonalLoan p = new PersonalLoan();
		double salary = p.getCustomerSalary();
		int age = p.getCustomerAge();
		int cibil = p.getCibilScore();
		if (salary >= 900000.00 && age >= 26 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Basic information is validated check personal details ");
			if (p.isPhoneValid() && p.isAadharValid() && p.isPanValid()) {
				System.out.println("Details are good & Loan got approved !!");
		        System.out.println("Your Loam ROI is : " + p.getLoanROI());
			} else {
				System.out.println("Something went wrong ! ");
			}
		} else {
			System.out.println("You are not eligible for Personal Loan");
		}

		System.out.println("Main method Ended");
	}

}
