package com.basics;

public class Variables {
	int studentid;
	String studentname;
	
	static int employeeid=12;
	static String employeename="pravalllika";

	public static void main(String[] args) {
		employeeid=12;
		employeename="pravallika";
	    System.out.println("employeeid "  +  employeeid );
	    System.out.println("employeename "  +  employeename);
	    Variables s1=new Variables();
	    s1.studentid=10;
	    s1.studentname="sagar";
	    System.out.println("studentid "  +  s1.studentid );
	    System.out.println("studentname "  + s1.studentname  );
   }
}