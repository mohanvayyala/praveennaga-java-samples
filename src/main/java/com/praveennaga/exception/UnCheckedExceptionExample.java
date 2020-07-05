package com.praveennaga.exception;

import java.util.Scanner;

public class UnCheckedExceptionExample {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("Division of two number is: " + c);
		}catch(ArithmeticException e) {
			System.out.println("Exception: " +e.getMessage());
		}
		System.out.println("Program continues!");
		sc.close();	
		int arr[] = {1,2,3,4,5};
		try {			
			System.out.println("The value of 10th element is:" +arr[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " +e.getMessage());
		}		
	}
}
