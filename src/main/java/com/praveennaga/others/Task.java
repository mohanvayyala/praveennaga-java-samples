package app.com.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task {

	public static void main(String[] args) {
		List<String> notesList = new ArrayList<>();
		Path out = Paths.get("notes.txt");
		Task.readFileIfExists(out, notesList);
		try (Scanner scanner = new Scanner(System.in);) {
			String note;
			System.out.println("Please input a Note");
			while (!(note = scanner.nextLine()).equalsIgnoreCase("Exit")) {
				notesList.add(note);
				System.out.println("\r\n");
				System.out.println("All Existing Notes :: ");
				notesList.stream().forEach(System.out::println);
				System.out.println("========================");
				System.out.println("Please input a Note[Type EXIT to terminate the program]");
			}
			Files.write(out, notesList, Charset.defaultCharset(), StandardOpenOption.APPEND);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void readFileIfExists(Path out, List<String> notesList) {
		try {
			notesList.addAll(Files.lines(out).collect(Collectors.toList()));
		} catch (Exception e) {// Ignore}
	}
}
