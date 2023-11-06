package com.prowing.overriding;

public class Demo2Child extends Demo2 {

	public void doSomething(int... nums) {
		System.out.println("inside doSomething(int... nums) in demo2Child");
	}

	public static void m1() {
		System.out.println("Child - m1");
	}

	public static void main(String[] args) {

		Demo2Child demo2 = new Demo2Child();

		demo2.doSomething();

		demo2.m1();
	}

}