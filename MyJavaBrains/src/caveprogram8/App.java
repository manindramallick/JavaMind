package caveprogram8;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\manindra.mallick\\workspace\\MyJavaBrains\\src\\caveprogram8\\Report.txt";
		ExecutorService executorService = null;
		Future<List<String>> future = null;
		Scanner scanner = null;
	
		try{
			executorService = Executors.newFixedThreadPool(10);
			File file = new File(filePath);
			scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				future = executorService.submit(new FileProcessor(scanner.nextLine()));
				List<String> lines =future.get();
			}
			//future = executorService.submit(new FileProcessor());
			
			//lines.stream().forEach(e -> System.out.println(e));
			
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
		 executorService.shutdown();
			try {
				executorService.awaitTermination(1, TimeUnit.DAYS);
			}catch (InterruptedException e) {
				System.out.println(e);
				
			}
			

		}
	}
			
}
