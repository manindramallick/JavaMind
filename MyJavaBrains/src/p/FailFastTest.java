package p;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastTest {

	public static void main(String[] args) { 
		  final Map<String,String> cityMap = new HashMap<String,String>();
		  cityMap.put("1","New York City" );
		  cityMap.put("2", "New Delhi");
		  cityMap.put("3", "Newark");
		  cityMap.put("4", "Newport");
		  //This thread will print the map values
		  // Thread1 starts 
		  Thread thread1 = new Thread(){ 
		   public void run(){ 
		    try{ 
		     Iterator i = cityMap.keySet().iterator(); 
		     while (i.hasNext()){ 
		      System.out.println(i.next()); 
		      // Using sleep to simulate concurrency
		      Thread.sleep(1000); 
		     }  
		    }catch(ConcurrentModificationException e){ 
		     System.out.println("thread1 : Concurrent modification detected on this map"); 
		    }catch(InterruptedException e){
		     
		    } 
		   } 
		  }; 
		  thread1.start(); 
		  // Thread1 ends
		   // This thread will try to remove value from the collection,
		  // while the collection is iterated by another thread.
		  // thread2 starts
		  Thread thread2 = new Thread(){ 
		   public void run(){ 
		     try{ 
		    // Using sleep to simulate concurrency
		      Thread.sleep(2000);
		      // removing value from the map
		      cityMap.remove("2"); 
		      System.out.println("city with key 2 removed successfully"); 
		     }catch(ConcurrentModificationException e){ 
		      System.out.println("thread2 : Concurrent modification detected on this map"); 
		     } catch(InterruptedException e){}
		    } 
		  }; 
		  thread2.start(); 
		// thread2 end
		 } // main end

}
