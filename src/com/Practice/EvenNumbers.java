package com.Practice;

import java.util.Scanner;

public class EvenNumbers {

//	public static void main(String[] args) {
//		for (int i = 0; i <= 100; i++) {
//			if (i != 0 && i % 2 == 0) {
//               System.out.println(i + " ");
//			}
//		}
//
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
		}
	  }
	}

}


