package com.Practice.IfElse;
import java.util.Scanner;
public class TwoOrMoreDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		if(n>=10 && n<=99) {
			System.out.println("The given  number is two digit ");
		}
		else if(n>=100 && n<=999) {
			System.out.println("The given number is three digit ");
		}
		else if(n>=1000) {
			System.out.println("The given number is more than three digits");
		}
		else{
			System.out.println("The given number is less than two digit ");
		}

	}

}
