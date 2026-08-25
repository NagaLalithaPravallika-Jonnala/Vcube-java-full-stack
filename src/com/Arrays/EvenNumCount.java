package com.Arrays;

import java.util.Scanner;

// input : 10,15,20,25,30
// output : 3
// Even number count
public class EvenNumCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Values : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("The Count is : " + count);

	}

}
