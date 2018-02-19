package caveprograms;

import java.util.concurrent.Semaphore;

public class Connecter {
	
	private static Connecter connecter = new Connecter();
	private int counter = 0;
	private Semaphore semaphore = new Semaphore(10,true); 
	private Connecter(){		
	}
	
	public static Connecter getConnecter() {
		return connecter;
	}
	
	
	public void connect() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		
		try {
			doconnect();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			semaphore.release();
		}
		
	}
	
	public void doconnect() {
		
		synchronized (this) {
			counter++;
			System.out.println("Connections :"+counter +" Thread id ::"+Thread.currentThread().getId());
		}
		
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println(e);
		}
		synchronized (this) {
			counter--;
		}
		
	}
	
}
