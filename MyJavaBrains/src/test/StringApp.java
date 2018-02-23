package test;

import java.util.Arrays;

public class StringApp {

	
	public static int recursiveMethod(char[] charAr, int i, int count) {
	    if (ifEquals(charAr[i - 1], charAr[i])) {
	        count = count + recursiveMethod(charAr, ++i, count);
	    }
	    return count;
	}

	public static boolean ifEquals(char a, char b) {
	    return a == b;
	}
	
	public static void main(String[] args) {
		
		String s="ABCABDABCEF";
		char[] str=s.toCharArray();
		 Arrays.sort(str);
		 for (int i = 1; i < str.length;) {
		        int count = recursiveMethod(str, i, 1);
		        if (count > 1) {
		            System.out.println("'" + str[i] + "' comes " + count + " times");
		            i = i + count;
		        } else
		            i++;	
		
	}
		
	}
	
}
