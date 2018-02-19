package caveprogram13;


interface interface1{
	
	default void print() {
	
		System.out.println("Interface1");
	}
}

interface interface2{
	
	default void print() {
	
		System.out.println("Interface2");
	}
}

class Base{
	public void print() {
		System.out.println("print");
	}
}
public class App extends Base implements interface1,interface2 {
	
	public static void main(String[] args) {
		new App().print();
	}

	

	

}
