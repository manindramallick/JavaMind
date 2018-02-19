package p;

import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

public class TestHashMap {

	
	String s ="mani";
	
	
	ObjectInputStream ios =null;
	
	public Object readResolve() {
    	
		return null;
    }
	

	public static void main(String[] args) {
	
		Map<String,String> hashMap = new ConcurrentHashMap<>(16,0.75f,4);
		
		Semaphore semaphore = new Semaphore(1);
		
		
	    
		
      Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("before map add");
				hashMap.put("A","1");
				hashMap.put("B","2");
				hashMap.put("C","3");
				hashMap.put("D","4");
				hashMap.put("E","5");
				hashMap.put("F","6");
				System.out.println("After map add");
			}
		});
		
	    t2.start();
	   
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("before map clear");
				hashMap.clear();
				System.out.println("After map clear");
			}
		});
		
	    t1.start();
		
		
		
		
    Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					Thread.sleep(1000);
					System.out.println("before map clear");
				Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
				while(iterator.hasNext()) {
					System.out.println("key --->"+iterator.next().getKey()+"  --  "+iterator.next().getValue());
				}
				System.out.println("After map clear");
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
	    t3.start();
	    
	    
	    try {
			t2.join();
			t1.join();
			t3.join();
		}catch (Exception e) {
		System.out.println(e);
		}
	    System.out.println("Map size -->"+hashMap.size());
		
		
	}
	
}
