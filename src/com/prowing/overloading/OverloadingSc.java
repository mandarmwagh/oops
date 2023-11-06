package com.prowing.overloading;

public class OverloadingSc {

	void m1(int i) {
		System.out.println("int");
	}

	void m1(long i) {
		System.out.println("long");
	}

	public static void main(String[] args) {

		OverloadingSc obj = new OverloadingSc();

		obj.m1(99999999);

	}

}