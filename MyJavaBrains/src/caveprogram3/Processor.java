package caveprogram3;

public class Processor implements Runnable{
	
	private int i;
	
	Processor(int i){
		this.i = i;
	}

	
	public void run() {
	
		System.out.println("start of Thread"+i);
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Finish of Thread"+i);
		
	}
	
	
	

}
