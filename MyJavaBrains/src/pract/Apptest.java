package pract;

public class Apptest{

	boolean check=false;
	public void print1st()  throws InterruptedException{
		synchronized (this) {
			while(!check) {
				System.out.println("print first");
				wait();
			}
			check =false;
			notify();
		}
		
		
		
	}
    public void print2st() throws InterruptedException{
		
    	synchronized (this) {
    		
    		while(check) {
    			System.out.println("print second");
    			wait();
    		}
    	
    		check =true;
    		notify();
    	}
    	
		
	}
	
   
    
   
    
	public static void main(String[] args) {
		
		Apptest test = new Apptest();
	
		Thread t1 = new Thread(new Runnable() {
			
			
			public void run() {
				
				for(int i=0;i<5;i++) {
					try {
				test.print1st();
				}catch (InterruptedException e) {
					// TODO: handle exception
				}
				}
					
				
			}
		});
	
  Thread t2 = new Thread(new Runnable() {
			
			
			public void run() {
				for(int i=0;i<5;i++) {
					try {
				test.print2st();
					}catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
			}
		});

t1.start();
t2.start();

try {
	t1.join();
	t2.join();
}catch (InterruptedException e) {
	// TODO: handle exception
}
	
	}


}
