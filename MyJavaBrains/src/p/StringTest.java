package p;

public class StringTest {

	public static void main(String[] args) {
		
		String s ="manindra";
		
		CharSequence sh="manindra";
		
		
		System.out.println(s.hashCode());
		System.out.println(sh.hashCode());
		
		
		System.out.println("Type of sh: " + sh.getClass().getSimpleName());
	    System.out.println("Type of s: " + s.getClass().getSimpleName());
	    System.out.println("Value of sh: " + sh);
	    System.out.println("Value of s: " + s);
	    System.out.println("Is sh a sing? " + (sh instanceof String));
	    System.out.println("Is sh a CharSequence? " + (sh instanceof CharSequence));
	    System.out.println("Is s a sing? " + (s instanceof String));
	    System.out.println("Is s a CharSequence? " + (s instanceof CharSequence));
	    System.out.println("Is \"hello\" a sing? " + ("hello" instanceof String));
	    System.out.println("Is \"hello\" a CharSequence? " + ("hello" instanceof CharSequence));
	    System.out.println("s.equals(sh)? " + s.equals(sh));
	    System.out.println("(s == sh)? " + (s == sh));

		
		
	}
	
}
