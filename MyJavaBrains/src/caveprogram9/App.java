package caveprogram9;

public class App {

	
	public static void main(String[] args) {
		
		ThreadLocal<BankTransaction> threadLocal = new ThreadLocal<>();
		for(int i=0;i<10;i++) {
			threadLocal.set(new BankTransaction(i, Float.valueOf((i*100))));
		}
	}
	
}
