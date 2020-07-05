package com.praveennaga.exception.custom;

public class InsufficientFundsException extends Exception {
	private static final long serialVersionUID = -5077686490745588740L;
	public InsufficientFundsException(String exception_Description) {
		super(exception_Description);
	}
}
