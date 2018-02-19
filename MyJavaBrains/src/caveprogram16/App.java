package caveprogram16;

public class App {

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
			System.out.println("Thread 1");	
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
			System.out.println("Thread 2");	
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			public void run() {
			System.out.println("Thread 3");	
			}
		});
		
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		}catch (InterruptedException e) {
			
		}
		
	}

}
