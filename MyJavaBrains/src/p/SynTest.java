package p;

public class SynTest {
	
	
	
 public  void first() {
	 
	   for(int i=0;i<100;i++) {
		System.out.println("first method");
	   }
		
	}

	
  public synchronized void second() {
		
	  for(int i=0;i<10;i++) {
			System.out.println("second method");
		   }
		
	}

  
  public synchronized void third() {
		
	  for(int i=0;i<100;i++) {
			System.out.println("third method");
		   }
		
	}
  
  
  public static synchronized void fourth() {
		
	  for(int i=0;i<10;i++) {
			System.out.println("fourth method");
		   }
		
	}
  
  public static void main(String[] args) {
	
  SynTest test = new SynTest();
  SynTest test1 = new SynTest();
  Thread t1= new Thread(new Runnable() {
	
	@Override
	public void run() {
		
		test.second();
		try {
		//Thread.sleep(10000);
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
});
  Thread t2= new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			test.third();
			
		}
	});
  t1.start();
  t2.start();
	
  }
}
