package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test44 {

	public static void main(String[] args) {
	
		List<String> mylist = new ArrayList<>();
		mylist.add("AAA");
		mylist.add("BBBB");
		mylist.add("CCCC");
		mylist.add("DDDD");
		mylist.add("EEEEE");
		
		/*for(String data : mylist) {
			mylist.remove(1);
			System.out.println("Data:-"+data);
		}
		*/
		
	/*	for(int i=0;i<mylist.size();i++) {
			if(mylist.get(i).equals("CCCC")) {
				mylist.remove(2);	
			}
		 System.out.println("Data:-"+mylist.get(i));
		}*/
		
			/*for(int i=0;i<mylist.size();i++) {
		    if(mylist.get(i).equals("CCCC")) {
		    	mylist.add("GGGGG");	
	    	}
	      System.out.println("Data:-"+mylist.get(i));
	       }*/
		
		/*Iterator<String> itr = mylist.iterator();
		for(int i=0;i<mylist.size();i++) {
			if(itr.next().equals("CCCC")) {
			    //mylist.remove("ctc");	
				itr.remove();
			}
			 System.out.println("Data:-"+mylist.get(i));
		}*/
		
		
		
		
		}
		
	}
	

