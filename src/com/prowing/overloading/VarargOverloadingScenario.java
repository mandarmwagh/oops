package com.prowing.overloading;

public class VarargOverloadingScenario {

	public void test(int i) {
		System.out.println("Int");
	}

	public void test(int... i) {
		System.out.println("Int varargs");
	}

//	public void test(char... c) {
//		System.out.println("Char varargs");
//	}

	public static void main(String[] args) {
		VarargOverloadingScenario obj = new VarargOverloadingScenario();
//		obj.test('a');
//		obj.test(10);
//		obj.test(10, 5, 6);
		obj.test('a', 'e', 'i', 'o');
	}

}