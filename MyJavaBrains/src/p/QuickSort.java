package p;

public class QuickSort {

	
	
	int part(int[] arr,int low,int high) {
		
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
		
	}
	
	 void sort(int[] arr,int low,int high) {
		
		if(low<high) {
			int i = part(arr,low,high);
			sort(arr,low,i-1);
			sort(arr,i+1,high);
		}
	}
	
	 public static void main(String[] args) {
		 QuickSort quickSort = new QuickSort();
		 int arr[] = {10, 7, 8, 9, 1, 5};
		 quickSort.sort(arr,0,arr.length-1);
		 
		 for(int k: arr)System.out.println(k);
		
	 
	}
}
