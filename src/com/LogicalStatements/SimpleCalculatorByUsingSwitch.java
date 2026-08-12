package com.LogicalStatements;

import java.util.Scanner;

public class SimpleCalculatorByUsingSwitch {

	public static void main(String[] args) {
		String yn = " ";
	do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		System.out.println("Enter b value : ");
		int b = sc.nextInt(); 
		System.out.println("Enter operator");
		char operator = sc.next().charAt(0);
		
	
			switch(operator) {
			case '+' -> {
				System.out.println("To Perform Addtion Operation the result is : " );
				System.out.println(a+b);	
			}
			case '-' ->{
				System.out.println("To Perform Subtraction Operation the result is : ");
				System.out.println(a-b);
				}
			case '*' ->{
				System.out.println("To Perform Multiplication Operation the result is : ");
				System.out.println(a*b);
			}
			case '/' ->{
				System.out.println("To Perform Division Operation the result is : ");
				System.out.println(a/b);
			}
			case '%' ->{
				System.out.println("To Perform Modulus Operation the result is : ");
				System.out.println(a%b);
			}
			}
			
			System.out.println("Do you want to Continue ?(Y/N)");
			yn = sc.next();

	}while(yn.equalsIgnoreCase("Y"));
	
	}

}
