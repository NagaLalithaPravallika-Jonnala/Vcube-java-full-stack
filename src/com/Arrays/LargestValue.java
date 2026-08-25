package com.Arrays;
//Largest value in an given array
import java.util.Scanner;

public class LargestValue {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Values : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest =  arr[i];
			}
			

	}
		System.out.println("Largest Value : " + largest);
	}
}




