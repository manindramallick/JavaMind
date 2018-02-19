package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map<Employee,Employee> mymap = new HashMap<>();
		
		
		
		List<Address> addlist= new ArrayList<>();
		Employee emp = new Employee(1, "mani", addlist);
		Address add = new Address();
		add.setCity("ctc");
		addlist.add(add);
		Address add1 = new Address();
		add1.setCity("BBSR");
		addlist.add(add1);
		System.out.println(emp);
		
		
		
		
		//Employee emp= new Employee(1,"mani");
		//mymap.put(emp, emp);
		//emp.setName("kunu");
		
		//System.out.println(mymap.get(emp));
		
		
		
	/*	Employee emp1= new Employee(1,"mani");
		Employee emp2= new Employee(1,"mani");
		
		mymap.put(emp1, emp1);
		mymap.put(emp2, emp2);

		System.out.println(mymap.get(emp2));*/
		
		//Collections.synchronizedSet(mymap.entrySet());
		
		/*for(int i=0;i<10;i++) {
			//mymap.put(new Employee(1, "mani"),new Employee(1, "mani"));
			//mymap.put(emp,emp);
		}*/
		//System.out.println(mymap.size());
		//System.out.println(mymap.get(1));
		//System.out.println(mymap.get(new Employee(1, "mani")));
		//System.out.println(mymap.get(emp));
	}

}
