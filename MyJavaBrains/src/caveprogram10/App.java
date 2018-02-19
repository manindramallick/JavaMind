package caveprogram10;

import java.util.HashMap;

public class App {

	
	public static void main(String[] args) {
		
       HashMap<Employee, String> empHashMap = new HashMap<>();
       
       
       Address address = new Address();
       address.setCity("Delhi");
       Employee employee = new Employee(1, "manindra", address);
       empHashMap.put(employee, "manindra");
       System.out.println(empHashMap.get(employee));
       employee.setEmpName("swarnalata");
       address.setCity("Noida");
       System.out.println(empHashMap.get(employee));
       
       
       
		
	}

}
