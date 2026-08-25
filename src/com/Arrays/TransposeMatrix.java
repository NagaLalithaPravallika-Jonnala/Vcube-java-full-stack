package com.Arrays;

import java.util.Scanner;

//TransposeMatrix 
//intput : 1 2 3
//         3 4 5
//output : 1 3
//         2 4
//         3 5
public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter no.of columns : ");
		int columns = sc.nextInt();
		int[][] arr = new int[rows][columns];
		System.out.println("Enter array elements :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Transpose Matrix : ");
		for (int j = 0; j <columns; j++) {
			for (int i = 0; i < rows; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
