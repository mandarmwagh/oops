package com.prowing.overriding;

public class Demo2 {

	public void doSomething(int... nums) {
		System.out.println("inside doSomething(int... nums) in demo2");
	}

	public static void m1() {
		System.out.println("Parent - m1");
	}

}