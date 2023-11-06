package com.prowing.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {

		Student s = new Student();

		System.out.println(s.getRollNo());
		System.out.println(s.getName());

		s.setRollNo(50);
		s.setName("Ram");

		System.out.println("====================");
		System.out.println(s.getRollNo());
		System.out.println(s.getName());

		System.out.println(s);
	}

}
