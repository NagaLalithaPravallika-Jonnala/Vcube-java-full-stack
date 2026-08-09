package com.LogicalStatements;
import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******************************************");
		System.out.println("       WELCOME TO DRIVING LICENSE         ");
		System.out.println("          VERIFICATION PORTAL             ");
		System.out.println("*******************************************");

		System.out.println("Enter the Name : ");
		String name = sc.next();

		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();

		if (age > 18) {

			System.out.println("Age Verification Successful");

			System.out.println("Do you have Aadhaar ? (True/False)");
			boolean aadhaar = sc.nextBoolean();

			if (aadhaar) {

				System.out.println("Aadhaar Verified Successfully");

				System.out.println("Do you have Learner License ? (True/False)");
				boolean learnerLicense = sc.nextBoolean();

				if (learnerLicense) {

					System.out.println("Learner License Verified Successfully");

					System.out.println("Do you pass Eye Test ? (True/False)");
					boolean eyeTest = sc.nextBoolean();

					if (eyeTest) {

						System.out.println("Eye Test Passed Successfully");
						System.out.println("Do you pass Driving Test ? (True/False)");
						boolean drivingTest = sc.nextBoolean();
						if (drivingTest) {
							System.out.println("Driving Test Passed Successfully");
							System.out.println("Did you pay License Fee ? (True/False)");
							boolean licencefeepaid = sc.nextBoolean();
							if (licencefeepaid) {
								System.out.println("License Fee Payment Successful");
								
								System.out.println("\n----------------------------------------");
								System.out.println("DRIVING LICENSE VERIFICATION REPORT");
								System.out.println("-----------------------------------------");
								System.out.println("Candidate Name : " + name);
								System.out.println("Age            : " + age);
								System.out.println("Aadhaar        : Verified");
								System.out.println("Learner License: Verified");
								System.out.println("Eye Test       : Passed");
								System.out.println("Driving Test   : Passed");
								System.out.println("Fee Payment    : Paid");
								System.out.println("\n-----------------------------------------");
								System.out.println("Final Status   : LICENSE APPROVED");
								System.out.println("Congratulations " + name + "!");
								System.out.println("Your Driving License has been Approved.");
								System.out.println("-----------------------------------------");

							} else {
								System.out.println("License Fee Not Paid");
								System.out.println("Final Status : LICENSE REJECTED");
								System.out.println("Reason : License Fee Pending");
							}

						} else {
							System.out.println("Driving Test Failed");
							System.out.println("Final Status : LICENSE REJECTED");
							System.out.println("Reason : Driving Test Failed");
						}

					} else {
						System.out.println("Sorry! You Failed the Eye Test");
						System.out.println("Final Status : LICENSE REJECTED");
						System.out.println("Reason : Eye Test Failed");
					}

				} else {
					System.out.println("Learner License is Required");
					System.out.println("Final Status : LICENSE REJECTED");
					System.out.println("Reason : Learner License Not Available");
				}

			} else {
                System.out.println("Aadhaar is Required");
				System.out.println("Final Status : LICENSE REJECTED");
				System.out.println("Reason : Aadhaar Not Available");
			}

		} else {
			System.out.println("Your Age is Not Eligible");
			System.out.println("Final Status : NOT ELIGIBLE");
			System.out.println("Reason : Minimum Age Should be Above 18 Years");
		}
    
		System.out.println("\n--------------------------------------------");
		System.out.println("Thank You for Using Driving License Portal");
		System.out.println("Visit Again!");
		System.out.println("---------------------------------------------");
		sc.close();
	}
}