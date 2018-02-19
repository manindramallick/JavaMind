package pool;

public class Runner {

	private ProcessorQueue<Runnable> processorqueue =null;
	private TaskExecutor taskExecutor = null;
	public Runner(int ids,int size) throws Exception{
		processorqueue = new ProcessorQueue<Runnable>(size);
		for(int i=0;i<ids;i++) {
			String threadname="name"+i;
			taskExecutor = new TaskExecutor(processorqueue);
			Thread t=null;
			t = new Thread(taskExecutor,threadname);
			t.start();
			
			
		}
		
		}
	
	public void submit(Runnable task) throws InterruptedException {
		processorqueue.putting(task);
	}
}
