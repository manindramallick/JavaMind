package p;

public class ArrayTest {

	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		
		int temp = arr[4];
		
		for(int i = 4-1;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		
		//arr[0]=temp;
		for(int k:arr) {
		System.out.print(k+",");
		}
	}
}
