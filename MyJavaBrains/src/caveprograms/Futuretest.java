package caveprograms;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Futuretest {

	
	public static void main(String[] args) {
	
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<Void> future = executor.submit(new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				
				Random r = new Random();
				int duration  = r.nextInt(1000);
				
				if(duration>200) {
					
					throw new IOException("waiting long");
					
				}
				
				try{
					//Thread.sleep(duration);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				return null;
			}
			
		});
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			
			IOException error= (IOException) e.getCause();
			System.out.println(error.getMessage());
		}
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
