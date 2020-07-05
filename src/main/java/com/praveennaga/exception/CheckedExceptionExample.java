package com.praveennaga.exception;

import java.io.*;

class CheckedExceptionExample {
	public static void main(String args[]) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:/abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int i;
		try {
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}