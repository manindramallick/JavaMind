package p;

public class ReverseArray {

	public void reverse(int[] arr,int start,int end) {
		
		if(start>end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverse(arr, start+1, end-1);
		
	}
	
  public void reverse(int[] arr) {
		
	   int length = arr.length;
	   int end = length-1;
	   for(int start=0;end>start;start++,end--) {
		int temp = arr[start];
		arr[start]= arr[end];
		arr[end] = temp;
		   
	   }
	
	}
  
  public void reverse(int[] arr, int k) {
	  
	  int i=0;
	  int j=k-1;
	  while(i<j) {
		  int temp = arr[i];
		  arr[i] = arr[j];
		  arr[j] = temp;
		  i++;
		  j--;
	  }
	  
  }
	
	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		
		ReverseArray reverseArray = new ReverseArray();
		//reverseArray.reverse(arr, 0, arr.length-1);
		//reverseArray.reverse(arr);
		reverseArray.reverse(arr, 4);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
