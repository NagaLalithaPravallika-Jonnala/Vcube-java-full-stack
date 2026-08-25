package com.Arrays;

import java.util.Scanner;

// Write a program to calculate sum of Right Diagonal Matrix
public class RightDiagonalMatrixSum {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix siize : ");
		int n = sc.nextInt();
		int sum =0;
		int sumRight =0;
		int[][] arr = new int[n][n];
		System.out.println("Enter Array Elements: " );
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
				if(i == j) {
					sumRight = sumRight + arr[i][j];
				}
				if(i +j == arr.length -1) {
					sum = sum + arr[i][j];
				}
				
			}
		}
		System.out.println("Sum of Left Diagonals are : " + sumRight);
		System.out.println("Sum of Right Diagonals : " + sum);
	}

}
