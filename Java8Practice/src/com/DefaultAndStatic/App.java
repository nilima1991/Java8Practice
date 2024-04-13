package com.DefaultAndStatic;

public class App implements I1 {
	public static void main(String[] args) {
		I1 i=new App();
		i.m1();
		I1.m2();
	}
	
}

