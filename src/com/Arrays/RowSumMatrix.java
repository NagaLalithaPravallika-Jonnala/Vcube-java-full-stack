package com.Arrays;

import java.util.Scanner;

public class RowSumMatrix {
	// intput : 1 2 3
//		       3 4 5
//		       5 6 7
	// output :1 2 3 ---->1+2+3=6
//		      3 4 5 ---->3+4+5=12
//		      5 6 7 ---->5+6+7=18
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
		System.out.println("Row wise sum is : ");
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += arr[i][j];
			}
			System.out.println(sum);
		}

	}

}
