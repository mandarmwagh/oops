package com.prowing.objectmethods;

public class TestObjectClassMethods2 {

	public static void main(String[] args) throws Throwable {

		Employee emp1 = new Employee(10, "Ram");

		System.out.println(emp1);

		// Calling finalize method explicitly - has no effect!! (Object will be only
		// reclaimed from memory if finalize method is invoked by GC internally!!)

//		emp1.finalize(); 

		emp1 = null;

		// below are the two ways by which we call Garbage Collection in Java
		System.gc();

		Runtime.getRuntime().gc();
	}

}