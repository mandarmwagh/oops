package com.prowing.exceptiondemo;

public class Calculator {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int res = division(a, b);

		System.out.println(">>>>>>>>>>> Division is : " + res);

	}

	public static int division(int a, int b) throws ArithmeticException {
		int res = 0;
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
//		try {
		res = a / b;
//		} catch (ArithmeticException e) {

//			System.out.println("Can not divide by ZERO!!!");
//		}
		System.out.println(res);
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		return res;
	}

}
