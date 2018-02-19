package p;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ByteTest {

	
	public static void main(String[] args) {
		
		int arr[] = {1,5,2,5,3,7,8,0};
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

		for(int i : arr) {
			priorityQueue.add(i);
		}
		while(priorityQueue.size()!=0) {
		System.out.println(priorityQueue.poll());
		}
		
		
		PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<Integer>(15,
				
				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o2-o1;
					}
			
			
				}
				);

		for(int i : arr) {
			priorityQueue1.add(i);
		}
		while(priorityQueue1.size()!=0) {
		System.out.println("----"+priorityQueue1.poll());
		}
		
		
	}

}
