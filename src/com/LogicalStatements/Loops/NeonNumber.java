package com.LogicalStatements.Loops;

import java.util.Scanner;
 
public class NeonNumber {
	static void square(int n) {
		int s=n*n;
        System.out.println("Square of given number " + s);
		int sum = 0;
		while(s > 0) {
		
			int digit = s % 10;
			sum = sum + digit;
			s = s/10;
		}
		if(n==sum) {
			System.out.println("It is a neon number");
		}
		else {
			System.out.println("It is not a neon number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		square(n);
		

	}

}
