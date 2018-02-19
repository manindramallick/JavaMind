package caveprogram10;

import java.util.Random;

public class Employee {
	
	private int empNo;
	private String empName;
	private Address address; 
	
	Employee(int empNo,String empName,Address address){
		this.empNo = empNo;
		this.empName = empName;
		this.setAddress(address);
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
/*	public boolean equal(Object obj) {
		
		if(this==obj) return true;
		
		if(obj instanceof Employee) {
			
			Employee emp =(Employee)obj;
			
			return emp.getAddress().getCity().equals(getAddress().getCity());
		}
		
		else return false;
		
	}
	
	public int hashCode() {
		return getEmpName().hashCode()+getAddress().hashCode();
	}*/
	
	public String toString() {
		
		return empName+","+empNo+","+getAddress().getCity();
	}

}
