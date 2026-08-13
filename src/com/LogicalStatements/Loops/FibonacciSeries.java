package com.LogicalStatements.Loops;
// To print fabonacci series
import java.util.Scanner;

public class FibonacciSeries {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter how many times do you want print :");
//		int n = sc.nextInt();
//		fibonacciSeries(n);
//	}
//	static void fibonacciSeries(int n) {
//		int n1 = 0;
//		int n2 = 1;
//		System.out.print(n1 + " " +n2 + " ");
//		int n3 = 0;
//		for (int i = 1; i <= n-2; i++) {
//			n3 = n1 + n2;
//			System.out.print(n3+ " ");
//			n1 = n2;
//			n2 = n3;
//		
//		}
//	}
	
	
//	Write a java program to find the Nth Fibonacci number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times do you want print :");
		int n = sc.nextInt();
		fibonacciSeries(n);
	}
	static void fibonacciSeries(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		for (int i = 1; i <= n-1; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println(n1);
	}

	
//	By using for loop nth number
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter how many times do you want print :");
//		int n = sc.nextInt();
//		int n1 = 0;
//		int n2 = 1;
//    	System.out.print(n1 + " " + n2 + " ");
//		int n3 = 0;
//		for (int i = 0; i <= n-2; i++) {
//			n3 = n1 + n2;
//			System.out.print(n3 + " ");
//			n1 = n2;
//			n2 = n3;
//			
//		}
//		System.out.println(n1);
//	}
	
	
}



