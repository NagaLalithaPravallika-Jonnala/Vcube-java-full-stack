package com.Arrays;
//Write a program to calculate sum of Right Diagonal Matrix
import java.util.Scanner;

public class LeftDiagonalMatrixSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Size : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int sum = 0;
		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				if (i == j) {
					sum = sum + arr[i][j];
				}
	          }	
			}

		System.out.println("Sum of Left diagonals are : " + sum);

	}

}
