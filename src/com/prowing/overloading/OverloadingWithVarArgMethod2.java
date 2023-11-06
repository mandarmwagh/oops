package com.prowing.overloading;

public class OverloadingWithVarArgMethod2 {

//	public void m1(char c)
//	{
//		System.out.println("m1(char c)");
//	}

//	public void m1(char[] c)
//	{
//		System.out.println("m1(char[] c)");
//	}

//	public void m1(int[] c)
//	{
//		System.out.println("m1(int[] c)");
//	}
//	
	public void m1(int... i) {
		System.out.println("m1(int... i)");
	}

//	public void m1(Character i)
//	{
//		System.out.println("m1(Character i)");
//	}

//	public void m1(char... i)
//	{
//		System.out.println("m1(char... i)");
//	}

	public static void main(String[] args) {

		OverloadingWithVarArgMethod2 obj = new OverloadingWithVarArgMethod2();

		char c = 'a';

		obj.m1(c);

	}

}