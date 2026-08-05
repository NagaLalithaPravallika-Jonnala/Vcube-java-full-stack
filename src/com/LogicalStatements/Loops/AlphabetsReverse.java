package com.LogicalStatements.Loops;

import java.util.Scanner;

public class AlphabetsReverse {
	void display(char ch) {
		for(char i = ch;i >='A'; i--) {
			System.out.print(i+" ");
		}
		}
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n value : ");
		char ch=sc.next().charAt(0);
			AlphabetsReverse m = new AlphabetsReverse();
			m.display(ch);
		}

}
