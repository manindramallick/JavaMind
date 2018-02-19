package p;

import java.util.ArrayList;
import java.util.List;

public final class Employee  implements Cloneable{

	private int id;
	private String name;
	private List<Address> add;
	private static Employee employee;
	
	
	private Employee()
	{
		
	}
	

	public Employee(int id,String name,List<Address> add)
	{
		this.id=id;
		this.name=name;
	    this.add = add;
	}
	
	
	public static Employee getObject() {
		
		if(employee==null) {
			synchronized (Employee.class) {
				
				if(employee == null) {
					employee = new Employee();
				}
			}
			
		}
		
		return employee;
		
	}
	
	
	

	public List<Address> getAdd() {
		return add;
	}

	public Object clone() throws CloneNotSupportedException
	{
		ArrayList<Address> list = new ArrayList<>();
		for(Address add: getAdd()) {
			list.add(add);
		}
		return list;
	}
	

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public String toString() {
		return "id-->"+id+"---Name-->"+name+"-->"+add;
	}
}
