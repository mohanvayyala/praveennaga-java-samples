package com.praveennaga.exception;

import java.io.IOException;

public class ExceptionExample {
 public static void main(String args[]) throws Exception {
//	 Sample s= new Sample();
//	 s.printFileContent();
	 
	 ExceptionExample ee= new ExceptionExample();
	 int cno=1234;
	 ee.checkCard(cno);
	 ee.readCard(cno);	 
 }
 
 void readCard(int cno) throws Exception{
	 System.out.println("Rearding Card"); 
 }
 void checkCard(int cno) throws RuntimeException{
	 System.out.println("Checking Card");
 }
}

class Sample{
	public void printFileContent() throws IOException {
		throw new IOException();
	}
}
