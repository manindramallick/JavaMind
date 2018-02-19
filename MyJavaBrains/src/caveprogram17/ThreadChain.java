package caveprogram17;

public class ThreadChain  extends Thread{
	
	private ThreadChain threadChain;
	
	public ThreadChain() {
		
	}
	
	public ThreadChain(ThreadChain threadChain) {
		this.threadChain = threadChain;
	}
	
	public void run() {
		System.out.println("Start Thread");
		try {
			if(threadChain!=null) {
			Thread.sleep(1000);
			threadChain.start();
			}
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		ThreadChain t1 = new ThreadChain();
		ThreadChain t2 = new ThreadChain(t1);
		ThreadChain t3 = new ThreadChain(t2);
		t3.start();
		
	}

}
