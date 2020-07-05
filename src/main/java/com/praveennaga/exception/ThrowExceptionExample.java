package com.praveennaga.exception;

public class ThrowExceptionExample {

	public static void main(String args[]) {
		int balance = 5000;
		int withdrawlAmount = 6000;
		try {
			if (balance < withdrawlAmount)
				// created an object of ArithmeticException class
				throw new ArithmeticException("Insufficient balance");
			balance = balance - withdrawlAmount;
			System.out.println(" Transactions successfully completed");
		} catch (ArithmeticException e) {
			System.out.println("Exception is: " + e.getMessage());
		}
		System.out.println("Programs continues!");
	}
}
