package com.Arrays;
//Write a program to print smallest value in an given array
import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int n = sc.nextInt();
		System.out.println("Enter Array Values : ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest Value in the given Array :  " + smallest);
	}

}
