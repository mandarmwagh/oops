package com.prowing.overloading;

/**
 * @author Shree This is an example to demonstrate Rule No. 4 - In method
 *         overloading there is no rule for AccessModifer, NonAccessModifier,
 *         Return Type and Exception.
 *
 */
public class OverloadingDemo2 {

	public void m1(int a) {
		System.out.println("m1(int a)");
	}

//	private void m1(int a, int b) {
//		System.out.println("m1(int a, int b)");
//	}

	public static void m1(Integer a) {
		System.out.println("m1(Integer a)");
	}

	public int m1(Object a) throws RuntimeException {
		System.out.println("m1(Object a)");
		return 10;
	}

	public static void main(String[] args) {

		OverloadingDemo2 demo = new OverloadingDemo2();

		demo.m1(10);

	}

}
