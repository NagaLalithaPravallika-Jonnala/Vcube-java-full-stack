package com.LogicalStatements.Loops;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
    	int n = sc.nextInt();
    	int temp=n;
	    int square = n * n;
//        if(square % 100 == n) {
//        	System.out.println("The given number is Automorphic ");
//        }
//        else {
//        	System.out.println("The given number is not automorphic ");
//        }
	
		int count=0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		System.out.println(temp);
		System.out.println(count);
		int last=square%(int)Math.pow(10, count);
		if(last==n) {
			System.out.println("automorphic");
		}
		else {
			System.out.println("not automorphic");
		}
		
	}

}
