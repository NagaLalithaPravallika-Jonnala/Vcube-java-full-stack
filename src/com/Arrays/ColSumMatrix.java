package com.Arrays;

import java.util.Scanner;

public class ColSumMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix size : ");
		int n = sc.nextInt();
		System.out.println("Enter matrix Elements : ");
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();

			}

		}
		System.out.println("Column wise sum is : ");
		for (int j = 0; j < n; j++) {
			int sum = 0;

			for (int i = 0; i < n; i++) {
				sum += arr[i][j];

			}
			System.out.println(sum);
		}

	}

}
