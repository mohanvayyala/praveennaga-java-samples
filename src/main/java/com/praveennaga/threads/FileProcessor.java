package com.praveennaga.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FileProcessor implements Runnable {
	 private Path fileName; 

	@Override
	public void run() {
		System.out.println( "File Started " +fileName+" by thread " + Thread.currentThread().getName());
		try {
			InputStream inputStream = Files.newInputStream(fileName);
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(inputStream));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println("File "+fileName+" processed with an issue "+e);
		}
		
		System.out.println( "File Ended " +fileName+" by thread " + Thread.currentThread().getName());

	}
	 public FileProcessor(Path filName) {
	        this.fileName = filName;
	 }
	public static void main(String args[]) throws InterruptedException, ExecutionException, IOException {		
		Path folderPath = FileSystems.getDefault().getPath("D:\\Files\\Input");		
		ExecutorService executor = Executors.newFixedThreadPool(4);				
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(folderPath)) {
			for (final Iterator<Path> it = stream.iterator(); it.hasNext();) {
				 Runnable worker = new FileProcessor(it.next());
				 executor.execute(worker);			
			}
		}		
		// This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();        
     // Wait until all threads are finish
        executor.awaitTermination(10,TimeUnit.SECONDS);
        System.out.println("Finished all threads");
	}

}
	