package caveprogram17;

public class ThreadChain1 extends Thread{

	private ThreadChain1 threadChain1;
	
	public ThreadChain1 getThreadChain1() {
		return threadChain1;
	}

	public void setThreadChain1(ThreadChain1 threadChain1) {
		this.threadChain1 = threadChain1;
	}
	
	
	public void run() {
		System.out.println("Started ");
		try {
			if(getThreadChain1()!=null) {
			Thread.sleep(1000);
			getThreadChain1().start();
			}
		    System.out.println("Thread name "+ Thread.currentThread().getName());	
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		ThreadChain1 threadChain1 = new ThreadChain1();
		
		ThreadChain1 threadChain2 = new ThreadChain1();
		
		ThreadChain1 threadChain3 = new ThreadChain1();
		
		threadChain1.setThreadChain1(threadChain2);
		threadChain2.setThreadChain1(threadChain3);
		threadChain1.start();

	}

	

}
