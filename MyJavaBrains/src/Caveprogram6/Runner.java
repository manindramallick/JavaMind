package Caveprogram6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

	private volatile  int count=0;
	private boolean firstFlag=false;
	private boolean secondFlag=false;
	private Lock flock = new ReentrantLock();
	private Lock slock = new ReentrantLock();
	public void checkLock(Lock flock,Lock slock)
	{
		try {
		firstFlag = flock.tryLock();
		secondFlag = slock.tryLock();
		
		if(firstFlag && secondFlag)
			return;
		if(firstFlag) {
			flock.unlock();
		}
		if(secondFlag) {
			slock.unlock();
		}
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			flock.unlock();
			slock.unlock();
		}
	}
	
	private void increment() {
		
		for(int i=0;i<100000;i++) {
			count++;
		}
	}
	
	
	public void firstThread() throws InterruptedException
	{
		
		try {
			flock.lock();
			
		 increment();	
		}
		finally {
			flock.unlock();
		}
	}
	
	
   public void secondThread() throws InterruptedException
	{
	   try {
		   flock.lock();
			increment();
		}
		finally {
			
			flock.unlock();
		}
		
	}
  
  public void showTotalCount()
  {
	  System.out.println("Total count --->"+count);
  }
}
