package com.Arrays;
//input:16,17,4,3,5,2
//output:17,5,2
import java.util.Scanner;

public class LeaderOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int leader = arr[arr.length - 1];
		System.out.println("The Leader of an given array is : " + leader);
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > leader) {
				leader = arr[i];
				System.out.println(leader);
			}
		}

	}

}
