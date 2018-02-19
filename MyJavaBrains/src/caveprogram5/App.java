package caveprogram5;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		
		String text ="I am a good boy.My name is manindra.I am working for IRIS."
				+ "I have 9years experience.";
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<List<String>> future =executorService.submit(new ParagraphProcessor(text));
		try {
			List<String> word = future.get();
			word.stream().forEach(e -> System.out.println(e));
		}catch (InterruptedException | ExecutionException e) {
			System.out.println(e);
		}
		
		finally {
			executorService.shutdown();
			try {
				executorService.awaitTermination(1, TimeUnit.DAYS);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}

}
