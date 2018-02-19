package sort;

import java.util.Set;
import java.util.TreeSet;

public class MapSort {

	public static void main(String[] args) {
		
		/*Map<Integer,String> map = new TreeMap<>();
		map.put(new Integer(1), "A");
		map.put(1, "A");
	
		System.out.println(map.size());*/
		
		Set<Object> set = new TreeSet<>();
		set.add(1);
		set.add(1);
		System.out.println(set.size());
		
		
		
		
		
		/*
		
		//System.out.println(map);
		
		Map<String,String> sortedMap = new TreeMap<>();
		sortedMap.putAll(map);
		System.out.println(sortedMap);
		
		
	   Map<String,String> mymap = new TreeMap<String,String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(Integer.parseInt(o1)>Integer.parseInt(o2))
				{
					return 1;
				}
				
				if(Integer.parseInt(o1)<Integer.parseInt(o2))
				{
					return -1;
				}
				else return 0;
				
			}
		});
	    mymap.putAll(map);
		
	    System.out.println(mymap);
	    
	    List<Entry<String,String>> mylist = new ArrayList<>(map.entrySet());
	    
	    Collections.sort(mylist, new Comparator<Entry<String,String>>() {
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				if(Integer.parseInt(o1.getKey())>Integer.parseInt(o2.getKey()))
				{
					return 1;
				}
				
				if(Integer.parseInt(o1.getKey())<Integer.parseInt(o2.getKey()))
				{
					return -1;
				}
				else return 0;
			}
		});
	    Map<String,String> map1 = new LinkedHashMap<>();
	    
	    for(Entry<String,String> entry : mylist) {
	    	
	    	map1.put(entry.getKey(), entry.getValue());
	    }
	    System.out.println(map1);
	    */
	}

}
