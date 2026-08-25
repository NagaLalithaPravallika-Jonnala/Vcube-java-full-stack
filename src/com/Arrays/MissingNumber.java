package com.Arrays;
//Missing number in an given array
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = arr[0];
		System.out.println("Enter array values : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Missing Numbers are : ");
		for (int num = 1; num <= max; num++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == num) {
					flag = true;
				}
			}
			if (flag == false) {
				System.out.print( num + "  " );
			}
			
		}

	}

}
