package com.Practice.IfElse;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("The Number is Positive");
		}
	    else if(n < 0) {
			System.out.println("The Number is Negative");
		}
	    else {
	    	System.out.println("The Number is zero ");
	    }

	}

}
