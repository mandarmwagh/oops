package com.prowing.overriding;

class A2 {
	public void method1(String s) {
		System.out.println("in A method1");
	}
}

class B2 extends A2 {
	public void method1() {
		System.out.println("in B method1");
	}
}

public class OverridingScenario1 {

	public static void main(String[] args) {

		A2 a = new B2();
		a.method1("hello");

	}

}