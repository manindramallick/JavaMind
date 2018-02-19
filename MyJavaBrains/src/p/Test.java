package p;

public class Test  implements Runnable{

volatile static int i = 1;
Object lock;
   Test(Object o){
	   this.lock=o;
   }
	
	public static void main(String[] args) {
		
		 Object o = new Object(); 
         Thread t1=new Thread(new Test(o));
         Thread t2=new Thread(new Test(o));
         t1.setName("Even");
         t1.start();
         t2.setName("Odd");
         t2.start();
		
		
	}

	@Override
	public void run() {
	    while (i <= 10) {
	        if (i % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
	            synchronized (lock) {
	                System.out.println(Thread.currentThread().getName() + " - "
	                        + i);
	                i++;
	                try {
	                    lock.wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        if (i % 2 == 1 && Thread.currentThread().getName().equals("Odd")) {
	            synchronized (lock) {
	                System.out.println(Thread.currentThread().getName() + " - "
	                        + i);
	                i++;
	                lock.notify();
	              }
	           }
	        }
	    }
	}