package pack;


abstract class Myabstract{
	
	public Myabstract() {
		System.out.println("call here1");
	}
}

public class AbstractCheck extends Myabstract{
	
	public AbstractCheck() {
	
		System.out.println("call here2");
	}
	

	public static void main(String[] args) {
		
		AbstractCheck check = new AbstractCheck();
		
	}
}
