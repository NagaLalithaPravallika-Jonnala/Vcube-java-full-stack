package com.LogicalStatements.Loops;

import java.util.Scanner;

public class PrimeOrNot {
static boolean prime(int n) {
	if(n<=1) {
		return false;
	}
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Prime Number : ");
		int n = sc.nextInt();
//		int count=0;
//		for(int i=1;i<=n;i++) {
//		if(n%i==0) {
//			count++;
//		}
//		}
//		if(count==2) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not prime");
//		}
		if(prime(n)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}





