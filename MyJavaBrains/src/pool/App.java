package pool;

public class App {
	
	public static void main(String[] args) {
		
		try {
			Runner r = new Runner(3, 4);
			for(int i=0;i<7;i++) {
			r.submit(new TestRunner(4));
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
