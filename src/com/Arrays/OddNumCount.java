package com.Arrays;
//Write a program to print odd number count in given an array
import java.util.Scanner;

public class OddNumCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array values : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
       System.out.println("The Count is : " + count);
	}

}
