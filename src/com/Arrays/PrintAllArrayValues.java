package com.Arrays;
// Write a program to print all the element in an array
import java.util.Scanner;

public class PrintAllArrayValues {

//	public static void main(String[] args) {
//		int[] a = { 10, 20, 30, 40, 50 };
//		for (int i = 0; i != a.length; i++) {
//			System.out.println(a[i]);
//		}
//
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Values : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The Array Values are :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("The sum is:");
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		    sum = sum + a[i];
		}
		System.out.println(sum);
		System.out.println("The Average is :");
		double avg = 0;
		for (int i = 0; i < a.length; i++) {
		    avg = sum/n;
		}
		System.out.println(avg);
	}

}
