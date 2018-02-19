package pool;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessorQueue<Runnable> {
	
	
	private Queue<Runnable> queue = new LinkedList<>();
	private int size=0;
	private static final int MAX_SIZE=10;
	
	public ProcessorQueue(int size) {
		this.size= size;
	}
	
	public void putting(Runnable e) throws InterruptedException {
		
		synchronized (queue) {
		
			if(queue.size()==MAX_SIZE) {
				queue.wait();
			}
			if(queue.isEmpty()) {
				queue.notify();
			}
			
			queue.offer(e);
		}
		
		
	}

   public Runnable getting()  throws InterruptedException{
	   
	   synchronized (queue) {
		   
			if(queue.isEmpty()) {
				queue.wait();
			}
			
			if(queue.size()==MAX_SIZE) {
				queue.notify();
			}
		
	}
		
		return queue.peek();
	}
}
