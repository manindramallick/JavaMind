package pack;

import java.util.Random;

public class ThreadLocalCheck  implements Runnable{

	public void run() {
	
		Random r = new Random();
		AppContext appContext =new AppContext();
		appContext.setTrx_ID(r.nextInt(100));
		AppThreadLocal.setContext(appContext);
		System.out.println(AppThreadLocal.getContext().getTrx_ID());
		
	}
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new ThreadLocalCheck());
		t.start();
		Thread t1 = new Thread(new ThreadLocalCheck());
		t1.start();
		
	}

	
	
	
	

}
