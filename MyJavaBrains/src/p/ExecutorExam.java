package p;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExam {

	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		service.submit(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}
