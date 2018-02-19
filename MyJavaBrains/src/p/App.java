package p;

public class App {

	private volatile int counter=0;
	
	public void firstThread() {
		for(int i=0;i<1000;i++) {
			increment();
		}
	}
	
	
    public void secondThread() {
		for(int i=0;i<1000;i++) {
			increment();
		}
	}
	
    public synchronized void increment() {
    	//System.out.println(Thread.currentThread().getId());
    	counter++;
    }
	
	public static void main(String[] args) {
		
		App app = new App();
		
		 Thread t1=new Thread(new Runnable() {
			public void run() {
				app.firstThread();
			}
		});
		 
		Thread t2= new Thread(new Runnable() {
				public void run() {
					app.secondThread();
				}
			});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
		 System.out.println("Total count :--"+app.counter);

	}

}
