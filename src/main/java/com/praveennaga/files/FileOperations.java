package com.praveennaga.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.stream.Stream;

public class FileOperations {

	static final long size = 1024;

	/**
	 * @param fileContent
	 * @param fileLocation
	 * @throws IOException
	 */
	public static void writeFileByOutputStream(final String fileContent, final String fileLocation) throws IOException {

		try (BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(fileLocation, true), "UTF-8"))) {
			out.write(fileContent + "\n");
		}

	}

	/**
	 * @param fileContent
	 * @param fileLocation
	 * @throws IOException
	 */
	public static void writeFileUsingFilesBufferedWriter(final String fileContent, final String fileLocation)
			throws IOException {
		Path filePath = Paths.get(fileLocation);
		try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8,
				StandardOpenOption.APPEND)) {
			writer.write(fileContent + "\n");

		}
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void readFileUsingStreams() throws FileNotFoundException, IOException {
		try (Stream<String> inputStream = Files.lines(Paths.get("input.txt"), StandardCharsets.ISO_8859_1)
				.filter(line -> !line.contains("line"))) {
			inputStream.forEach(System.out::println);
		}
	}

	/**
	 * @param inputFile
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void readFileUsingBufferReader(File inputFile) throws FileNotFoundException, IOException {
		try (BufferedReader fileBufferReader = new BufferedReader(new FileReader(inputFile))) {
			String fileLineContent;
			while ((fileLineContent = fileBufferReader.readLine()) != null) {
				if (fileLineContent.contains("line")) {
					continue;
				}
				System.out.println(fileLineContent);
			}
		}
	}

	/**
	 * @param filePath
	 * @param data
	 * @throws IOException
	 */
	public static void appendData(String filePath, String data) throws IOException {
		try (RandomAccessFile raFile = new RandomAccessFile(filePath, "rw");) {
			raFile.seek(raFile.length());
			System.out.println("current pointer = " + raFile.getFilePointer());
			raFile.write(data.getBytes());
		}

	}

	/**
	 * @param filePath
	 * @param data
	 * @param seek
	 * @throws IOException
	 */
	public static void writeData(String filePath, String data, int seek) throws IOException {
		try (RandomAccessFile file = new RandomAccessFile(filePath, "rw");) {
			file.seek(seek);
			file.write(data.getBytes());
		}
	}

	/**
	 * @param filePath
	 * @param seek
	 * @param chars
	 * @return
	 * @throws IOException
	 */
	public static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
		try (RandomAccessFile file = new RandomAccessFile(filePath, "r");) {
			file.seek(seek);
			byte[] bytes = new byte[chars];
			file.read(bytes);
			return bytes;
		}

	}

	/**
	 * @param inputFile
	 * @throws IOException
	 */
	public static void readUsingFileInputStream(File inputFile) throws IOException {
		try (FileInputStream fis = new FileInputStream(inputFile);) {
			System.out.println("Total file size to read (in bytes) : " + fis.available());
			int content;
			while ((content = fis.read()) != -1) {
				System.out.println((char) content);
			}
		}
	}

	/**
	 * @param inputFile
	 * @throws IOException
	 */
	public static void readUsingFileReader(File inputFile) throws IOException {
		try (FileReader fr = new FileReader(inputFile);) {
			int content;
			while ((content = fr.read()) != -1) {
				System.out.println((char) content);
			}
		}
	}

	/**
	 * @param file
	 */
	public static void makeFilereadonly(File file) {
		file.setReadOnly();
		if (file.canWrite()) {
			System.out.println("This file is writable");
		} else {
			System.out.println("This file is read only");
		}

		// revert the operation, mark this file as writable
		file.setWritable(true);

		if (file.canWrite()) {
			System.out.println("This file is writable");
		} else {
			System.out.println("This file is read only");
		}
	}

	/**
	 * @param file
	 */
	public static void checkHiddenFile(File file) {
		if (file.isHidden()) {
			System.out.println("This file is hidden");
		} else {
			System.out.println("This file is not hidden");
		}
	}

	/**
	 * @param outputFile
	 * @throws IOException
	 */
	public static void createFile(File outputFile) throws IOException {
		if (outputFile.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}
	}

	/**
	 * @param outputFile
	 * @throws FileNotFoundException
	 */
	public static void writeUsingPrintWriter(File outputFile) throws FileNotFoundException {
		try (PrintWriter printWriter = new PrintWriter(outputFile)) {
			printWriter.write("Hello World ");
			printWriter.write((int) 123);

		}
	}

	/**
	 * @throws IOException
	 */
	public static void createDirectories() throws IOException {
		Path path = Paths.get("./Praveen/directory");
		Files.createDirectories(path);
	}

	/**
	 * @param rootDirectory
	 * @throws IOException
	 */
	public static void getDirectorySize(Path rootDirectory) throws IOException {
		long directorySize = Files.walk(rootDirectory).map(f -> f.toFile()).filter(f -> f.isFile())
				.mapToLong(f -> f.length()).sum();

		System.out.println("size of the directory is ::" + directorySize);
	}

	/**
	 * @param source
	 * @throws IOException
	 */
	public static void listFile(Path source) throws IOException {
		Files.walk(source).filter(Files::isRegularFile).forEach(System.out::println);
	}

	/**
	 * @param path
	 * @throws IOException
	 */
	public static void printFileBasicAttributes(Path path) throws IOException {

		BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		BasicFileAttributes basicFileAttributes = fileAttributeView.readAttributes();

		System.out.println("creationTime: " + basicFileAttributes.creationTime());
		System.out.println("lastAccessTime: " + basicFileAttributes.lastAccessTime());
		System.out.println("lastModifiedTime: " + basicFileAttributes.lastModifiedTime());

		System.out.println("isDirectory: " + basicFileAttributes.isDirectory());
		System.out.println("isOther: " + basicFileAttributes.isOther());
		System.out.println("isRegularFile: " + basicFileAttributes.isRegularFile());
		System.out.println("isSymbolicLink: " + basicFileAttributes.isSymbolicLink());
		System.out.println("size: " + basicFileAttributes.size());
	}

	/**
	 * @param path
	 * @throws IOException
	 */
	public static void printFileOwnerAttributes(Path path) throws IOException {

		FileOwnerAttributeView fileOwner = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
		System.out.println("File Owner Name " + fileOwner.getOwner());
	}

	/**
	 * @param path
	 * @throws IOException
	 */
	public static void printFileStore(Path path) throws IOException {

		FileStore store = Files.getFileStore(path);

		long total = store.getTotalSpace() / size;
		long used = (store.getTotalSpace() - store.getUnallocatedSpace()) / size;
		long available = store.getUsableSpace() / size;

		System.out.println("Total Space used : " + total);
		System.out.println("Total used space : " + used);
		System.out.println("Total available space :" + available);

	}

	/**
	 * @throws IOException
	 */
	public static void StringIO() throws IOException {
		String inputString = "This is a String to demo as how to convert it to input stream using Core Java API";

		// String to input stream
		try (InputStream inputStream = new ByteArrayInputStream(inputString.getBytes(StandardCharsets.UTF_8));
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
			String content;

			while ((content = bufferedReader.readLine()) != null) {
				System.out.println(content);
			}

		}
	}
}
