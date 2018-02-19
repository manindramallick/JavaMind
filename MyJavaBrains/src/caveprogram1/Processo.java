package caveprogram1;

public class Processo  extends Thread{
	private volatile boolean flag=true;

	public void run() {
		
		while(flag) {
		
			System.out.println("Running");
		}
		try {
			Thread.sleep(10000);
		}catch (InterruptedException e) {
		    System.out.println(e);
		}
		
		
	}
	
	public void finsih() {
		flag=false;
	}

}


/*public class Processo implements Runnable
{

	public void run() {
	
		for(int i=0;i<10;i++) {
			System.out.println(" Hi am "+i);
		}
		
	}
	
}*/