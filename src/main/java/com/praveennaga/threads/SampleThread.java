package com.praveennaga.threads;

class MyRunnable1 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
		}
	}
}

class MyRunnable2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
		}
	}
}

public class SampleThread {
	public static void main(String... args) throws InterruptedException {
		Thread thread1 = new Thread(new MyRunnable1(), "Thread-1");
		Thread thread2 = new Thread(new MyRunnable2(), "Thread-2");
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		
		System.out.println("Main Thread");
	}
}
