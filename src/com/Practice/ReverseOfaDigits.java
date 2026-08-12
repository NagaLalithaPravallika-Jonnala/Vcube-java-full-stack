package com.Practice;

import java.util.Scanner;

public class ReverseOfaDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int s = 0;
		while (a > 0) {
			int digit = a % 10;
			s = s * 10 + digit;
			a = a / 10;
		} 
		System.out.println("Reverse of a Number : " + s);
	}

}
