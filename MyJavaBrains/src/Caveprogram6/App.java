package Caveprogram6;

public class App {

	public static void main(String[] args) throws Exception{
		
		Runner r = new Runner();
		
		Thread t1= new Thread(new Runnable() {
			public void run() {
				try {
				r.firstThread();
				}catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		});
		
      Thread t2= new Thread(new Runnable() {
						public void run() {
							try {
								r.secondThread();
							}catch (InterruptedException e) {
								// TODO: handle exception
							}
				
			}
		});
   
     
       t1.start();
       t2.start();
       t1.join();
       t2.join();
       r.showTotalCount();
		
	} 
	
}
