package p;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<String> bq= new LinkedBlockingQueue<>();
		Thread producer = new Thread(new Producer(bq),"producer");
		Thread consumer = new Thread(new Consumer(bq),"consumer");
		producer.start();
		consumer.start();
		
	}
	
	
	
	
}

class Producer implements Runnable
{
	
	String[] chars= {"A","B","C","D"};

	BlockingQueue<String> bq=null;
	Producer(BlockingQueue<String> bq){
		this.bq=bq;
	}
	
	
	@Override
	public void run() {
		
		for(String s:chars) {
			
			
				try {
					bq.put(s);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	
		
	}
	
}

class Consumer implements Runnable
{
	
	int[] nos= {1,2,3,4};
	
	BlockingQueue<?> bq=null;
	Consumer(BlockingQueue<?> bq){
		this.bq=bq;
	}
	
	@Override
	public void run() {
		
		while(true) {
		try {
			
			String s=(String) bq.take();
			System.out.println(s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	
}
