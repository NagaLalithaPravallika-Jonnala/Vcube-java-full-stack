package com.languageFundamentals.Constructors;

public class Quiz {
	String subject;
	int totalquestions;
	double timeLimit;
	Quiz(){
		this("Java");
		System.out.println("No arg constructor called ");
	}
	Quiz(String subject){
		this(subject,20);
		System.out.println("one arg constructor called");
	}
	Quiz(String subject,int totalquestions){
		this(subject,totalquestions,20);
		 System.out.println("two arg constructor called");
	}
	Quiz(String subject,int totalquestions,double timeLimit){
		
		this.subject=subject;
		this.totalquestions=totalquestions;
		this.timeLimit=timeLimit;
		System.out.println("Subject : " + subject);
		System.out.println("Total Questions : " + totalquestions);
		System.out.println("Time Limit : " + timeLimit);
		System.out.println("full arg constructor called ");
		
	}

	public static void main(String[] args) {
		Quiz q = new Quiz();
		
		}

}
