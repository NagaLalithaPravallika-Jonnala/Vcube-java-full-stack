package com.Arrays;

import java.util.Scanner;
// Write a program to search element in an given array
public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : " );
		int n = sc.nextInt();
		System.out.println("Enter Array Values : ");
		int[] arr = new int[n];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Search Number is :");
		int search = sc.nextInt();
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == search) {
				System.out.println("The number is present in the given list");
			}
		}
	    System.out.println("The number is not present int the given list ");

	}

}
