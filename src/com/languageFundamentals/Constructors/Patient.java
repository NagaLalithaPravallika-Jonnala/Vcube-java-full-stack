package com.languageFundamentals.Constructors;
import java.util.Scanner;
public class Patient {
    String patientName;
    int age;
    int roomChargesPerDay;
    int noOfDaysAdmitted;
    Patient(String patientName, int age, int roomChargesPerDay,int noOfDaysAdmitted){
    	this.patientName=patientName;
    	this.age=age;
    	this.roomChargesPerDay=roomChargesPerDay;
    	this.noOfDaysAdmitted=noOfDaysAdmitted;
     	
    }
    
    void display() {
    	int totalBill;
    	System.out.println("Total Bill : " + (totalBill= roomChargesPerDay* noOfDaysAdmitted));
    	
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Patient Name : ");
		String patientName = sc.next();
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter the Room Charges Per Day : ");
		int roomChargesPerDay = sc.nextInt();
		System.out.println("Enter the Number of Days Admitted :");
		int noOfDaysAdmitted = sc.nextInt();
		Patient p =new Patient(patientName, age, roomChargesPerDay,noOfDaysAdmitted);
		p.display();
	}

}
