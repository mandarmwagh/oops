package com.prowing.overriding;

class Parent1 {

	synchronized Object addition(int a, int b) throws Exception {
		System.out.println("inside Parent1 - addition");
		return a + b;
	}

}

/*
 * class Child1 extends Parent1 { protected Integer addition(int a, int b)
 * throws SQLException { System.out.println("inside Child1 - addition"); return
 * a + b; } }
 */
public class Scenario1 {

	public static void main(String[] args) throws Exception {

//		Parent1 p1 = new Child1();

//		p1.addition(10, 20);

	}
}
