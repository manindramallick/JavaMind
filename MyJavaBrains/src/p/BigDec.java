package p;

import java.math.BigDecimal;

public class BigDec {

	
	public static void main(String[] args) {
		
		
		// false
		System.out.println(BigDecimal.valueOf(11) == BigDecimal.valueOf(11));
		// true
		System.out.println(BigDecimal.valueOf(11).equals(BigDecimal.valueOf(11)));
		// true
		System.out.println(BigDecimal.valueOf(1) == BigDecimal.valueOf(1));
		
		
		/*BigDecimal test = new BigDecimal(0);
		System.out.println(test);
		test.add(new BigDecimal(30));
		System.out.println(test);
		test.add(new BigDecimal(45));
		System.out.println(test);
		*/
		
		    BigDecimal test = new BigDecimal(0);
			System.out.println(test);
			test = test.add(new BigDecimal(30));
			System.out.println(test);
			test = test.add(new BigDecimal(45));
			System.out.println(test);
	}
	
}
