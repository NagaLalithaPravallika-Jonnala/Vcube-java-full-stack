package com.basics;

public class Student {
	int sid;
	String sname;
	String saddress;
	int sage;
	public static void main(String[] args) {
	Student s1=new Student();
	s1.sid=10;
	s1.sname="Pravallika";
	s1.saddress="Andhra Pradesh";
	s1.sage=21;
	System.out.println("Student id : " + s1.sid );
	System.out.println("Student name : " + s1.sname );
	System.out.println("Student address : " + s1.saddress );
	System.out.println("Student age : " + s1.sage );
	System.out.println();
	Student s2=new Student();
	s2.sid=11;
	s2.sname="Lakshmi";
	s2.saddress="Andhra Pradesh";
	s2.sage=22;
	System.out.println("Student id : " + s2.sid );
	System.out.println("Student name : " + s2.sname );
	System.out.println("Student address : " + s2.saddress );
	System.out.println("Student age : " + s2.sage );
	
	}

}


