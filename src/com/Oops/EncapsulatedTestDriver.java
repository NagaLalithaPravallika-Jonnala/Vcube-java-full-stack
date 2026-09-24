package com.Oops;

public class EncapsulatedTestDriver {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		EncapsulatedClassEmployee e = new EncapsulatedClassEmployee();
        e.setEid(101);
        System.out.println(e.getEid());
        e.setEname("Pravallika");
        System.out.println(e.getEname());
        e.setsalary(20000);
        System.out.println(e.getsalary());
        e.setPassword();
        System.out.println(e.getPassword());
	}

}
