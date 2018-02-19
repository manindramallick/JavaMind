package caveprogram11;

import java.time.LocalDate;

public class BasePerson implements Person{

	private String name;
	private int age;
	private LocalDate dob;
	
	public void print() {
	System.out.println("Print person info"+getName()+"--"+getAge()+"--"+getDob());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	
}
