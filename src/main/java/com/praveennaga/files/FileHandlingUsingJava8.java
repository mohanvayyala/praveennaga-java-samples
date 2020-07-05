package com.praveennaga.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileHandlingUsingJava8 {
	
	public static void main(String args[]) throws IOException {
		List<String> al=Files.lines(Paths.get("praveen.txt"))
		     .filter(line-> line.startsWith("C"))
		     .map(line->line.replaceAll("C", "P"))
		     .collect(Collectors.toList());
		System.out.println(al);
		
		Files.walk(Paths.get("."))
		     .filter(path->path.toString().toLowerCase().endsWith(".txt"))
		     .forEach(System.out::println);
		Path p=Paths.get(".");
		Files.find(p, 2,(P,BasicFileAttributes)->String.valueOf(Paths.get(".")).endsWith(".txt"))
		     .forEach(System.out::println);
		     
	
	}

}
