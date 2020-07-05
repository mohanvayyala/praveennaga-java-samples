package com.praveennaga.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadSampleWorker implements Runnable {

	private int command;

	@Override
	public void run() {
		System.out.println("Command " + command + " Started " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Command " + command + " Ended " + Thread.currentThread().getName());

	}

	public ThreadSampleWorker(int command) {
		this.command = command;
	}

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new ThreadSampleWorker(i);
			executor.execute(worker);
		}
		// This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        
     // Wait until all threads are finish
        executor.awaitTermination(10,TimeUnit.SECONDS);
        System.out.println("Finished all threads");
	}

}