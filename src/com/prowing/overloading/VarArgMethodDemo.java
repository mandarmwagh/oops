package com.prowing.overloading;

public class VarArgMethodDemo {

	public void add(String s, int... nums) {
		int res = 0;

		for (int n : nums) {
			res += n;
		}
		System.out.println(s);
		System.out.println(res);
	}

	public static void main(String[] args) {

		VarArgMethodDemo obj = new VarArgMethodDemo();

		obj.add("Hello", 10, 20, 30);

	}

}
