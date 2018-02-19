package pract;

public class App {

	public static void main(String[] args) {
		
		Processor processor1 = new Processor();
		Processor processor2 = new Processor();
		Processor processor = new Processor();
		
		Thread t1 = new Thread(new Runnable() {
			
			
			public void run() {
				try {
				processor.printbyFirstThread();
				}
				catch (InterruptedException e) {
					System.out.println(e);
				}
				
			}
		});
		
	Thread t2 = new Thread(new Runnable() {
			
			
			public void run() {
			
				try {
				processor.printbySecondThread();
				}catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		});
	
	Thread t3 = new Thread(new Runnable() {
		
		
		public void run() {
			try {
			processor.printbyThirdThread();
			}catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
	});
		
	
	t1.start();
	t2.start();
	t3.start();
	
	}
}
