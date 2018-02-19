package caveprograms7;

public class App {

	public static void main(String[] args) throws Exception{
		
		Processer processer = new Processer();
		
		Thread t1=new Thread(new Runnable() {
			public void run() {

			try {	
				
			for(int i=0;i<10;i++) {	
	         processer.prducer(i);
			}
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			}
		});

		
		Thread t2= new Thread(new Runnable() {
			public void run() {
				try {
					
				processer.consumer();
				
				}catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
		});

		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		
		
	}

}
