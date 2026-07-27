package com.Practice;
import java.util.Scanner;
public class Swap {
	int a;
	int b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value : ");
		int a = sc.nextInt();
		System.out.println("Enter the b value : ");
		int b = sc.nextInt();
	    System.out.println("Before swap  " );
	    System.out.println("Before swap a value " + a);
	    System.out.println("Before swap b value " + b);
	    int temp;
	    temp = a;
	    a = b;
	    b=temp;
		System.out.println("After swap  ");
		System.out.println("After swap a value " + a);
		System.out.println("After swap b value " + b); 

		

	}

}
