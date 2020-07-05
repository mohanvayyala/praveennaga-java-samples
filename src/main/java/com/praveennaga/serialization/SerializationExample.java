package com.praveennaga.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		Card c = new Card("Praveen", 32, "Regila", 200000);
		String fileName = "Praveen.ser";
		FileOutputStream file = null;
		ObjectOutputStream out = null;

		// Serialization
		try {
			file = new FileOutputStream(fileName);
			out = new ObjectOutputStream(file);
			out.writeObject(c);

		} catch (IOException e) {
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
