package com.basics;

public class testDemo1 {
	public static void main(String[] args) 
	{
		System.out.println("Main Method Stated");
		method1();
		
    }
	public static void method1() 
	{
		method2();
		System.out.println("Method1");
		
	}
	static void method2() 
	{
		testDemo1 t=new testDemo1();
		t.method3();
		System.out.println("Method2");
	}
	void method3()
	{
		method4();
		System.out.println("Method3");
	}
	void method4()
	{
		method5();
		System.out.println("Method4");
	}
	public static void method5() 
	{
		System.out.println("Method5");
	}
 }

