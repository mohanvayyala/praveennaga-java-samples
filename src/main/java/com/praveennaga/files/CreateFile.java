package com.praveennaga.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String args[]) {
		try {
			File file = new File("praveen.txt");
			if (file.createNewFile()) {
				System.out.println("File created" + file.getName());
			} else {
				System.out.println("File created successfully");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
