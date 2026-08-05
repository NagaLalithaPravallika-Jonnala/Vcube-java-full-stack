package com.LogicalStatements.Loops;
import java.util.Scanner;
public class Multiplication {
	void display(int n) {
	for(int i = 1;i <= n; i++) {
		System.out.println(i * n);
	}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
    	Multiplication m = new Multiplication();
		m.display(n);
	}

}
