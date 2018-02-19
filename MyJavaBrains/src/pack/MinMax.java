package pack;

public class MinMax {

	public static void main(String[] args) {
		
		int[] arr = {1,4,8,2,7};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Max Element :"+ max);
		System.out.println("Min Element :"+ min);		
	}

}
