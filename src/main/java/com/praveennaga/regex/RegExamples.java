package com.praveennaga.regex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExamples {
	public static void main(String[] args) {

		Pattern p = Pattern.compile(",\\s");
		String[] fields = p.split("John Doe, 47, Hillsboro Road, 32000");
		for (int i = 0; i < fields.length; i++)
			System.out.println(fields[i]);

		System.out.println(Arrays.toString("John Doe, 47, Hillsboro Road, 32000".split("\\s")));

		List<String> progLangs = Arrays.asList("apl", "basic", "c", "c++", "c#", "cobol", "java", "javascript", "perl",
				"python", "scala");
		Pattern p1 = Pattern.compile("^c");
		progLangs.stream().filter(p1.asPredicate()).forEach(System.out::println);

		Pattern p2 = Pattern.compile("ox");
		Matcher m = p2.matcher("Lion Fox");
		while (m.find())
			System.out
					.println("Found [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));
		
		Pattern p3 = Pattern.compile("(.(.(.)))");
		Matcher m3 = p3.matcher("abc");
		m3.find();
		System.out.println(m3.groupCount());
		for (int i = 0; i <= m3.groupCount(); i++)
		   System.out.println(i + ": " + m3.group(i)); 
		
		// ip address - \b\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}\b
		// email id- \b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}\b
		
		Scanner s= new Scanner(System.in);
		Pattern p4= Pattern.compile(s.nextLine());
		Matcher m4=p4.matcher(s.nextLine());
		while (m4.find())
			System.out.println(m4.group());
		s.close();

	}

}
