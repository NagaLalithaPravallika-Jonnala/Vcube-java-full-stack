package com.Practice;
import java.util.Scanner;
public class SwapWithOutTemp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value : ");//2
		int a = sc.nextInt();
		System.out.println("Enter b value ");//3
		int b = sc.nextInt();
		System.out.println("Before Swap");
	    System.out.println("Enter a value : " + a);//2
	    System.out.println("Enter b value : " + b);//3
	    a = a+b;//5=a
	    b = a-b;//5-3=2
	    a = a-b;//5-2=3
	    
	    System.out.println("After Swap");
	    System.out.println("Enter a value : " + a);
	    System.out.println("Enter a value : " + b);
		

	}

}
