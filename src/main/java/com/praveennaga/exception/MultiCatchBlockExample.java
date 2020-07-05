package com.praveennaga.exception;

public class MultiCatchBlockExample {
	public static void main(String[] args) {
		try {
			// System.out.println(10/ 0);
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e); // java.lang.NullPointerException
		}
	}
}
