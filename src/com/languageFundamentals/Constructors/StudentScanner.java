package com.languageFundamentals.Constructors;

import java.util.Scanner;

public class StudentScanner {
	static Scanner sc = new Scanner(System.in);
	int id;
	String name;
    String course;
	public StudentScanner() {
		System.out.println("enter id");
		int id = sc.nextInt();
		this(id);
	}

	public StudentScanner(int id) {
		sc.nextLine();
		System.out.println("enter name");
		String name = sc.nextLine();

		this(id, name);

	}

	public StudentScanner(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void m() {
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		StudentScanner s = new StudentScanner();
		s.m();

	}

}
