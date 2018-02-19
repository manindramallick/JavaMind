package pool;

public class TaskExecutor implements Runnable {

	
	ProcessorQueue<Runnable> processorqueue;
	
	public TaskExecutor(ProcessorQueue<Runnable> processorQueue) {
		this.processorqueue = processorQueue;
	}
	
	public void run() {
	
		try {
			System.out.println("Task start");
			Runnable r=processorqueue.getting();
			r.run();
			System.out.println("task finished");
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		
		
	}

}
