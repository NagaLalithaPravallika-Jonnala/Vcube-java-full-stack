package com.Arrays;

import java.util.Scanner;

//Count even and odd numbers
//intput:2,3,4,5,6
//output:even count:3
//       odd count :2
public class EvenCountAndOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		System.out.println("Enter Array elements ");
		int[] arr = new int[n];
		int even = 0;
		int odd =0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				even++;
				
			} else {
				
				odd++;
			}
			
		}
		System.out.println("The Odd Number Count is : " + odd);
		System.out.println("The Even Number Count is : " + even);
	}

}
