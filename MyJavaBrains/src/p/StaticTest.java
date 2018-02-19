package p;

class BaseStaticTest{
	
	public  static void show() {
		System.out.println("show base");
	}
}

public class StaticTest  extends BaseStaticTest{

	
	public static void show() {
		System.out.println("show base2");
	}
	
	public static void main(String[] args) {
		
		BaseStaticTest baseStaticTest = new StaticTest();
		baseStaticTest.show();
	}
}
