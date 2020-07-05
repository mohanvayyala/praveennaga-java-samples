package com.praveennaga.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String args[]) {

		FileWriter fw = null;
		try {
			fw = new FileWriter("Praveen.txt");
			fw.write("This is Praveen Oruganti");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != fw) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
