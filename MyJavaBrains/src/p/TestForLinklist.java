package p;

import java.util.*;
public class TestForLinklist {

	
	public static void main(String[] args) {
		
		List<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		
		System.out.println(A.toString());
		List<Integer> B=new ArrayList<>(A.subList(2,4));
	    System.out.println(B.toString());
	 
	    List<Integer> C = new ArrayList<>();
	    B.removeAll(B);
	    System.out.println(B.toString());
	    C.addAll(A);
	    System.out.println(C.toString());
	    
	    
		
		
		
	}
}
