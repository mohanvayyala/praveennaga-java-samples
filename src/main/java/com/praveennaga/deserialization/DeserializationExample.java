package com.praveennaga.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.praveennaga.serialization.Card;

public class DeserializationExample {

	public static void main(String[] args) {
		String fileName = "Praveen.ser";
		FileInputStream file = null;
		ObjectInputStream in = null;
		Card c;
		try {

			file = new FileInputStream(fileName);
			in = new ObjectInputStream(file);
			c = (Card) in.readObject();
			System.out.println(c.toString());

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
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
