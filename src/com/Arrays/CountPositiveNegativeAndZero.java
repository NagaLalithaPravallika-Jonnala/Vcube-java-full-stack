package com.Arrays;

import java.util.Scanner;

//input : 2,3,0,4,-7,-2,0,3,-6
//output : Positive Numbers---->4
//           Negative Numbers---->3
//           Zero -----2
public class CountPositiveNegativeAndZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		int positive =0;
		int negative=0;
		int zero =0;
		System.out.println("Enter array elements : ");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] < 0) {
				negative++;
			} else {
				zero++;
			}
		}
       System.out.println("Positive Numbers count is : " + positive);
       System.out.println("Negative Number count is : " + negative);
       System.out.println("Zero count is : " + zero);
	}

}
