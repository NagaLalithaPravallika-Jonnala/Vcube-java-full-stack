package com.Arrays;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Size : ");
		int n = sc.nextInt();
		System.out.println("Enter Matrix Values : ");
		int[][] arr = new int[n][n];
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix : ");
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		


	}

}
