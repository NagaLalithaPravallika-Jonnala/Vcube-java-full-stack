package com.LogicalStatements;

import java.util.Scanner;

public class JobRecruitmentSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   ABC COMPANY RECRUITMENT PORTAL");
        System.out.println("==========================================");

        System.out.print("Enter Candidate Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Candidate Age: ");
        int age = sc.nextInt();

        if (age >= 21) {

            System.out.print("Enter Graduation Percentage: ");
            double percentage = sc.nextDouble();

            if (percentage >= 60) {

                System.out.println("\nEligible for Screening Round.");

                System.out.print("Enter Aptitude Test Marks (Out of 30): ");
                double aptitudeMarks = sc.nextDouble();

                if (aptitudeMarks >= 20) {

                    System.out.println("\nQualified for Technical Round.");

                    System.out.print("Do you have Java knowledge? (true/false): ");
                    boolean java = sc.nextBoolean();

                    if (java) {

                        System.out.print("Do you have SQL knowledge? (true/false): ");
                        boolean sql = sc.nextBoolean();

                        if (sql) {
                            System.out.println("\n==========================================");
                            System.out.println("Congratulations, " + name + "!");
                            System.out.println("You have been SELECTED for the Software Developer role.");
                            System.out.println("Welcome to ABC Company!");
                            System.out.println("==========================================");
                        } else {
                            System.out.println("\nApplication Rejected.");
                            System.out.println("Reason: SQL knowledge is mandatory for this role.");
                        }

                    } else {

                        System.out.println("\nJava knowledge is mandatory.");

                        System.out.print("Do you have SQL knowledge? (true/false): ");
                        boolean sql = sc.nextBoolean();

                        if (!sql) {
                            System.out.println("\nApplication Rejected.");
                            System.out.println("Reason: Both Java and SQL skills are required.");
                        } else {
                            System.out.println("\nApplication Rejected.");
                            System.out.println("Reason: Java knowledge is mandatory.");
                        }
                    }

                } else {
                    System.out.println("\nApplication Rejected.");
                    System.out.println("Reason: Minimum 20 marks are required in the Aptitude Test.");
                }

            } else {
                System.out.println("\nApplication Rejected.");
                System.out.println("Reason: Minimum 60% graduation percentage is required.");
            }

        } else {
            System.out.println("\nApplication Rejected.");
            System.out.println("Reason: Candidate must be at least 21 years old.");
        }

        sc.close();
    }
}