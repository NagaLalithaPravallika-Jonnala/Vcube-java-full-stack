package com.languageFundamentals.Constructors;

public class Student {
	int id;
	String name;
	String course;
	Student(){
		this(65);
		
		}
	Student(int id){
		this(id,"pravallika");
	}
	Student(int id,String name){
		this(id,name,"core java");
	}
	Student(int id,String name,String course){
		this.id=id;
		this.name=name;
		this.course=course;
	
	}
	
     
	public static void main(String[] args) {
		Student s1 = new Student();
        System.out.println("Student Id : " + s1.id);
        System.out.println("Student Name : " + s1.name);
        System.out.println("Student Course : " + s1.course);  
		
	}
	

}
