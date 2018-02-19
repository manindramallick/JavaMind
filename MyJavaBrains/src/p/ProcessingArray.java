package p;

public class ProcessingArray {

	
	
	public static void main(String[] args) {
		
		int[] arr = {5,0,3,0,1,2,0,0,6};
		int length = arr.length;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count=count+1;
			}
					
		}
		
		for(int j=count;j<length;j++) {
			arr[count]=0;
		     count=count+1;
		
	}
		
		for(int k=0;k<count;k++) {
			System.out.println(arr[k]);
		}
		
	}

}
