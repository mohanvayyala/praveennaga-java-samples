package com.praveennaga.oops;

abstract interface Interface {
	void m0();
	static void m1() {
		System.out.println("M1");
	}

	default void m2() {
		System.out.println("M2");
	}

	class InterfaceInnerClass {
		InterfaceInnerClass() {
			System.out.println("InterfaceInnerClass");
		}

		void m3() {
			System.out.println("M3");
		}
	}

	interface Interface1 {
		void m4();

		default void m5() {
			System.out.println("M5");
		}

		static void m6() {
			System.out.println("M6");
		}
	}

}

public class InterfaceExample implements Interface,Interface.Interface1{

	@Override
	public void m0() {
		System.out.println("M0");
		
	}
	
	public static void main(String args[]) {
		InterfaceExample interfaceExample= new InterfaceExample();
		interfaceExample.m0();
		Interface.m1();
		interfaceExample.m2();
		new Interface.InterfaceInnerClass().m3();
		interfaceExample.m4();
		interfaceExample.m5();
		Interface.Interface1.m6();
		
		
		
	}

	@Override
	public void m4() {
		System.out.println("M4");
		
	}

}
