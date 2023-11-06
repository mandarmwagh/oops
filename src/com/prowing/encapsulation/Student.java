package com.prowing.encapsulation;

public class Student {

	private int rollNo;
	private String name;
//	private static String schoolName = "ABC School";

	public Student() {

	}

	public Student(int rn, String nm) {
		this.rollNo = rn;
		this.name = nm;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}