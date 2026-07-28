package com.Practice;
import java.util.Scanner;
public class SwapWithOutTemp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		System.out.println("Enter b value ");
		int b = sc.nextInt();
		System.out.println("Before Swap");
	    System.out.println("Enter a value : " + a);
	    System.out.println("Enter b value : " + b);
	    a = a+b;
	    b = a-b;
	    a = a-b;
	    
	    System.out.println("After Swap");
	    System.out.println("Enter a value : " + a);
	    System.out.println("Enter a value : " + b);
		

	}

}
