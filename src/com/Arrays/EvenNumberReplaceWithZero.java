package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//input : 1 2 3  Even Numbers replace with 0's
//        4 5 6  odd numbers replace with -1's
//        7 8 9
//output : -1 0 -1
//          0 -1 0
//         -1 0 -1
public class EvenNumberReplaceWithZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter Columns : ");
		int columns = sc.nextInt();
		System.out.println("Enter Array Elements : ");
		int[][] arr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (arr[i][j] % 2 == 0) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = -1;
				}
			}

		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
	}

}
