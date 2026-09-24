package com.Arrays;
//input : 1 2 3
//        3 4 5
//        5 6 7 
//output : 3 2 1
//         3 4 5
//         7 6 5
import java.util.Scanner;

public class ConvertEvenRowsReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter Columns : ");
		int columns = sc.nextInt();
		System.out.println("Enter matrix values : ");
		int[][] arr = new int[rows][columns];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i % 2 == 0) {
					int start = 0;
					int end = arr[i].length - 1;
					while (start <= end) {
						int temp = arr[i][start];
						arr[i][start]=arr[i][end];
						arr[i][end] = temp;
						start++;
						end--;
					}

				} else if (i % 2 != 0 && i != j) {
					arr[i][j] *= 2;
				}
			}

		}
//		for(int i =0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				if(i%2 !=0) {
//				arr[i][j] = arr[i][j]*2;
//				}
//			}
//		}
       for(int i =0;i<arr.length;i++) {
    	   for(int j =0;j<arr.length;j++) {
    		   System.out.print(arr[i][j] + " ");
    	   }
    	   System.out.println( );
       }
	}

}
