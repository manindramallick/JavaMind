
package pract;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Processor {

	private Semaphore semaphore = new Semaphore(1,true);
	/*private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	private Lock lock3 = new ReentrantLock();*/

	
	
	public  void printbyFirstThread() throws InterruptedException{
		int[] arr = {1,4,7};
			for(int i=0;i<arr.length;i++) {
				System.out.println("Print by Thread 1:"+arr[i]);
			
			}
			}
	
	public  void printbySecondThread() throws InterruptedException{
		int[] arr = {2,5,8};
		for(int i=0;i<arr.length;i++) {
			System.out.println("Print by Thread 2:"+arr[i]);
			
			
		}
		
		
	}
	
	public  void printbyThirdThread() throws InterruptedException{
		int[] arr = {3,6,9};
		for(int i=0;i<arr.length;i++) {
			System.out.println("Print by Thread 3:"+arr[i]);
			
			
		}
		
	}
	
	
}
