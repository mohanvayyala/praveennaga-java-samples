package com.praveennaga.others;

public class WrapperClass {

	public static void main(String args[]) {
		WrapperClass wc = new WrapperClass();
		Integer num1 = new Integer(25);
		Integer num2 = new Integer(50);
		int num3 = 75;
		int num4 = 100;
		System.out.println(" Add Primitive : " + wc.addPrimitive(num1, num2)); // Autoboxing
		System.out.println(" Add Object : " + wc.addObject(num3, num4)); // Unboxing
	}

	public int addPrimitive(int i, int j) {
		return i + j;

	}

	public Integer addObject(Integer i, Integer j) {
		return i + j;
	}

}
