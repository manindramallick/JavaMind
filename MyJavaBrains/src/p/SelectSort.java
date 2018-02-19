package p;

public class SelectSort {

	
	public static void main(String[] args) {
		
		int[] arr = {7,2,5,1,4,6};
		int temp=0;	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
				  temp =arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
				}
			}
		}
		
		for(int k =0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
}
