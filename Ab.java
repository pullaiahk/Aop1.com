package com.aop.pullaiah;

public class B {
	static B a;
	B b;
	static int c;

	public static void main(String[] args) {
		a.b.c = 10;
		System.out.println(c);
	}

}
