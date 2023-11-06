package com.prowing.overloading;

public class OverloadingWithVarArgMethod {

//	public void add(int i, int j)
//	{
//		System.out.println("add(int i, int j)");
//	}

//	public void add(long i, int j)
//	{
//		System.out.println("add(long i, int j)");
//	}

//	public void add(Integer i, Integer j)
//	{
//		System.out.println("add(Integer i, Integer j)");
//	}

	public void add(int... i) {
		System.out.println("add(int... i)");
	}

	public static void main(String[] args) {

		OverloadingWithVarArgMethod obj = new OverloadingWithVarArgMethod();

		obj.add(10, 10);

	}

}