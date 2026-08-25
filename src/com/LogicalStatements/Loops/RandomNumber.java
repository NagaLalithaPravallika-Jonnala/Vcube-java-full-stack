package com.LogicalStatements.Loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(10);
		int chance = 3;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= chance; i++) {
			System.out.println("Enter a number : ");
			int n = sc.nextInt();
			if (a == n) {
				System.out.println("You Won");
				break;
			} else if (i <= 2) {
				System.out.println("Try Again");
			} else {
				System.out.println("Better Luck Next Time");

			}

		}
	}
}
