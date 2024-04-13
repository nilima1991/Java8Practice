package com.DefaultAndStatic;

public interface I1 {
	default void m1()
	{
	System.out.println("Default m1 method");
	}
	static void m2()
	{
		System.out.println("this is static method from i1");
	}
	
}
