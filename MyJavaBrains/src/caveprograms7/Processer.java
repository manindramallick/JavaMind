package caveprograms7;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Processer {
	private BlockingQueue<Integer> list = new LinkedBlockingQueue<>();
	private static final int MAX_SIZE=10;
	public void prducer(int task) throws InterruptedException 
	{
	synchronized (list) {
	
     	if(list.size()==MAX_SIZE) {
			list.wait();
		}
		list.put(task);
		list.notify();
	   	Thread.sleep(1000);
		System.out.println("producer "+task);
	}
	}	
	
	public void consumer() throws InterruptedException
	{
	  
	  synchronized (list) {
		
	
		while(true) {
				if(list.isEmpty()) {
					list.wait();
				}
				int i= list.take();
				System.out.println("I am here -->"+i);
				list.notify();
				Thread.sleep(1000);
			}
	  }
		}
		
	
}
