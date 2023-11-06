package com.prowing.objectmethods;

public class Student implements Cloneable {

	int roll;
	String name;
	Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Address add = new Address(123, "Pune");

		Student s1 = new Student(10, "Ram", add);
		Student s2 = (Student) s1.clone();

		System.out.println(s1 == s2);
		System.out.println(s1.address == s2.address);

		System.out.println("===== S1 =====");
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address.pin);
		System.out.println(s1.address.city);
		System.out.println("===== S1 =====");

		System.out.println("===== S2 =====");
		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.address.pin);
		System.out.println(s2.address.city);
		System.out.println("===== S2 =====");

		System.out.println("==== Changing S1 addresss ======");

		s1.name = "Sham";

		System.out.println("==== After Changing S1 ======");

		System.out.println("===== S1 =====");
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address.pin);
		System.out.println(s1.address.city);
		System.out.println("===== S1 =====");

		System.out.println("===== S2 =====");
		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.address.pin);
		System.out.println(s2.address.city);
		System.out.println("===== S2 =====");

	}

}