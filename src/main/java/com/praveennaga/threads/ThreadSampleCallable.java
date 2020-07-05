package com.praveennaga.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*The executor framework which uses Runnable objects. Unfortunately a Runnable cannot return a result to the caller.
In case you expect your threads to return a computed result you can use java.util.concurrent.Callable. The Callable object allows to return values after completion.
The Callable object uses generics to define the type of object which is returned.
If you submit a Callable object to an Executor, the framework returns an object of type java.util.concurrent.Future. 
Future exposes methods allowing a client to monitor the progress of a task being executed by a different thread. 
Therefore, a Future object can be used to check the status of a Callable. It can also be used to retrieve the result from the Callable.
On the Executor you can use the method submit to submit a Callable and to get a future. To retrieve the result of the future use the get() method.
*/
public class ThreadSampleCallable implements Callable<String> {
	private int command;
	@Override
	public String call() throws Exception {
		return "Praveen " + command+" "+Thread.currentThread().getName();
	}
	
	public ThreadSampleCallable(int command) {
		this.command = command;
	}

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		  List<Future<String>> list = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			Future<String> future = executor.submit(new ThreadSampleCallable(i));
			list.add(future);
		}		
		 // now retrieve the result
        for (Future<String> future : list) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
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
