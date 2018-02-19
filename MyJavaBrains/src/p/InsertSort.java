package p;

public class InsertSort {

	
	public static void main(String[] args) {
		
		int[] arr = {14,1,0,11,-9,-7};
		int temp,j;
		for(int i=1;i<arr.length;i++)
		{
			temp = arr[i];
			j=i-1;
			while(j!=-1 && temp<arr[j] && j>=0) {
				arr[j+1] =arr[j];
				--j;
			
			}
			
			arr[j+1]=temp;
			
			
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
}
