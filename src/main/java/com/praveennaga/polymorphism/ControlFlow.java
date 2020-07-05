package com.praveennaga.polymorphism;

public class ControlFlow {

	public static void main(String args[]) {

		A1 a1 = new A1();
		a1.displayA1();
	}

}

class A1 {
	A1() {
		System.out.println("In constructor A1");
	}

	static {
		System.out.println("In static block of A1");
	}

	{
		System.out.println("In initialization block of A1");
	}

	void displayA1() {
		System.out.println("In displayA1 method");
	}

}
