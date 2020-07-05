package com.praveennaga.exception;

public class FinallySystemExitExample {
	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}
