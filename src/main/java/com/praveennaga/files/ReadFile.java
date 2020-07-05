package com.praveennaga.files;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String args[]) {
		FileReader fr = null;
		try {
			fr = new FileReader("Praveen.txt");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

}
