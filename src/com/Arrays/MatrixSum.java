package com.Arrays;
//Write a program to print n*n matrix sum
import java.util.Scanner;

public class MatrixSum {

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
				sum = sum + arr[i][j];
			}
		
		}

		System.out.println("Sum of all elements are : " + sum);
	}

}
