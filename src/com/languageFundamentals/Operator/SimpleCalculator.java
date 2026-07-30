package com.languageFundamentals.Operator;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value : ");
        int a = sc.nextInt();
        System.out.println("Enter the b value : ");
        int b = sc.nextInt();
        System.out.println("Enter the operators :(+ or -) ");
        char ch = sc.next().charAt(0);
        int res = (ch == '+') ? (a+b) : (a-b);
        System.out.println(res);
	}

}
