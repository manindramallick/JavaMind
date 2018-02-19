package sort;

public class MaxElementReplace {

	
	public static void main(String[] args) {
	
		int[] arr = {2,4,7,1,5,6};
		
		int length = arr.length;
		
		int max =0;
		
		max = arr[length-1];
		
		arr[length-1]=0;
		
		for(int i=length-2;i>=0;i--) {
			
			int temp = arr[i];
			arr[i] = max;
			
			
			if(max<temp) {
				max= temp;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
