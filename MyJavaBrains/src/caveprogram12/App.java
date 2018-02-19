package caveprogram12;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		
		int[][] arr = {{1,1,1,0},{1,1,1,0},{1,0,1,1},{0,1,1,0}};
		
		Map<String,Integer> mymap = new LinkedHashMap<>();
		 for(int i=0;i<arr.length;i++) {
			
			 for(int j =0;j<arr[i].length;j++) {
				 if(arr[i][j]==1) {
					 if(mymap.containsKey("row_"+i)){
					 mymap.put("row_"+i, mymap.get("row_"+i)+1);
					 }
					 else{
						 mymap.put("row_"+i, 1);
					 }
					 
				 }
				 else if (arr[i][j]==0) {
					    if(mymap.containsKey("row_"+i) && mymap.get("row_"+i)<3){
						 mymap.put("row_"+i, mymap.get("row_"+i)-1);
						 }
					   
						
				 }
				
				
			 }
			
		 }
		 
		
		
		 for(Entry<String,Integer> entry : mymap.entrySet())
		 {
			 if(entry.getValue()==3) {
		 System.out.println(entry.getValue()+"--"+entry.getKey());
			 }
		 }
	}
}
