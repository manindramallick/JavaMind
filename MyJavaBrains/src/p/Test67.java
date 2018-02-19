package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test67 {

	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		
		System.out.println(list.stream().filter( i -> i>3).collect(Collectors.toList()));
	
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next()>3) {
				iterator.remove();
			}
		}
		
		System.out.println(list);
	}
}
