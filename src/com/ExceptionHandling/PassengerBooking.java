package com.ExceptionHandling;

import java.util.Scanner;

public class PassengerBooking {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("in try");
			System.out.println("Enter Passenger ID : ");
			String pId = sc.next();
		    int a =Integer.parseInt(pId);			
		}catch(Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("in try");
			System.out.println("Enter Passenger age : ");
			String pAge = sc.next();
		    int a =Integer.parseInt(pAge);			
		}catch(Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		
		
		
		try {
			System.out.println("in try");
			System.out.println("Enter number of baggage : ");
			int passenger = sc.nextInt();
			System.out.println("Total number of baggage : ");
			int total = sc.nextInt();
			int averagebaggage = total/passenger;
			System.out.println("Average Baggage : " + averagebaggage);
		}catch(Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		try { 
			
		}catch(Exception e) {
			
		}
		System.out.println("Main method ended");
		
		

	}

}
