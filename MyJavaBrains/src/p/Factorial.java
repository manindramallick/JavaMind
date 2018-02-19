package p;

public class Factorial {

	
	public static int fact(int n) {
		int fact=1;
		while(n>0) {
			fact *=n;
			n=n-1;
		}
		return fact;
	}
	
	
	public static int factRecursive(int n) {
		
		if(n==1) {
			return 1;
		}
		return n*factRecursive(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(factRecursive(9));
		System.out.println(System.currentTimeMillis());
		
	}
}
