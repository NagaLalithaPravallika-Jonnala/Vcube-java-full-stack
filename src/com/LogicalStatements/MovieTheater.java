package com.LogicalStatements;
import java.util.Scanner;
public class MovieTheater {
      
	public static void main(String[] args) {
		int price=200;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Ticket Type : ");
		String ticketType = sc.nextLine();
		System.out.println("Enter the Customer Age : ");
		int age = sc.nextInt();
		
		switch(ticketType) {
		
		case "Silver" -> {
			price=200;
			if(age >=60){
				price = price-(price*10/100);
				System.out.println("Silver ticket Price : " + price);
			}
				else {
					price=200;
				}
			}
		case "Gold" ->{
		price=300;
			if(age >=60){
				
				price = price-(price*10/100);
				System.out.println("Gold ticket Price : " + price);
			}
				else {
					price=300;
				}
		}
		case "Platinum" ->{
			price=00;
			if(age >=60){
				price = price-(price*10/100);
				System.out.println("Platinum ticket Price : " + price);
			}
				else {
					price=500;
				}
		}
		default ->{
			System.out.println("Exit");
		}
			
		
		}

	}

}
