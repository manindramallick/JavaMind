package caveprogram4;

public class ThreadTest  extends Thread{

	
	public void run() {
		
		System.out.println("Check---");
	}
	
	
	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		threadTest.start();
		threadTest.checkAccess();
		//threadTest.interrupt();
		//System.out.println(threadTest.isInterrupted());
		
	}

}
