package p;

public class Test1 extends Thread{

	Object obj;
	int no[]= {1,2,3,4,5};
	char ch[]= {'a','b','c','d','e'};
	Test1(Object o){
		this.obj=o;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Object obj= new Object();
        Test1 t1=new Test1(obj);
        Test1 t2=new Test1(obj);
        t1.start();
        t2.start();
		
	}
	
	@Override
	public void run()
	{
		int i=0;
		int j=0;
		synchronized(obj) {
			
			while(i<5) {
				System.out.println("Numbers First: "+no[i]);
				i++;
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
    synchronized(obj) {
			
			while(j<5) {
				System.out.println("Numbers Second: "+ch[j]);
				j++;
				try {
					obj.notify();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
		
	}

}
