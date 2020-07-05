package com.praveennaga.coding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionClass {

	static public void main(String... args) {

	}

	public void method() throws Exception {
		throw new Exception();
	}

	public void method1() {
		throw new RuntimeException();
	}

	public void method2() throws IOException {
		throw new IOException();
	}

	public void method3() {
		throw new NullPointerException();
	}

	public void method4() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

}
