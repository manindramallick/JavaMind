package caveprogram3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=0;i<100;i++) {
		service.submit(new Processor(i));
		}
		
		service.shutdown();
		try {
			service.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
