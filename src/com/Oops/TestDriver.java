package com.Oops;

public class TestDriver {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Employee e = new Employee();
        e.setEmpId(18);
        System.out.println(e.getEmpId());
        e.setEmpName("Pravallika");
        System.out.println(e.getEmpName());
        e.setEmpSalary(200000);
        System.out.println(e.getEmpSalary());
	}

}
