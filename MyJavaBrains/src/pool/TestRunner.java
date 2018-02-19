package pool;

public class TestRunner  implements Runnable{

	private int i;
	public TestRunner(int i) {
		this.i=i;
	}
	
	public void run() {
	
		System.out.println("print "+i);
		
	}

}
