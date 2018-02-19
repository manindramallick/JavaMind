package p;


public class SwitchTest {

	
	
	
	public static void main(String[] args) {
		
		String name="AAA";
		System.out.println(check(name));
		
		
	}
	
	public static String check(String name) {
		
		switch (name) {
		case "AAA":
			return "YYY";
			default:
				return "ZZZ";
		}
	}
}
