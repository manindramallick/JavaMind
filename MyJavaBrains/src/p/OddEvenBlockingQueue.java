package p;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class OddEvenBlockingQueue {

	
	public static void main(String[] args) {
		BlockingQueue<Integer> even= new LinkedBlockingQueue<>();
		BlockingQueue<Integer> odd= new LinkedBlockingQueue<>();
		int max=10;
		Thread producer = new Thread(new Producer1(even,odd,max),"producer");
		Thread consumer = new Thread(new Producer1(odd,even,max),"consumer");
		even.offer(1);
		producer.start();
		consumer.start();
		
	}
}
	
	
	class Producer1 implements Runnable
	{
		BlockingQueue<Integer> even=null;
		BlockingQueue<Integer> odd=null;
		int max_size=1;
		Producer1(BlockingQueue<Integer> even,BlockingQueue<Integer> odd,int max){
			this.even=even;
			this.odd=odd;
			this.max_size=max;
			
		}
		
		
		@Override
		public void run() {
			
			  while(true) {
					try {
						int i= (int)odd.take();
						System.out.println(Thread.currentThread().getName()+"---"+i);
						even.offer(i+1);
						if(i>max_size) {
							System.exit(0);
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
				
			  }
		
			
		}
		
	}
	

