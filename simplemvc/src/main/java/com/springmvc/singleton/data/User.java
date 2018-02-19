package com.springmvc.singleton.data;


public class User {

	private String firstname;
	private String lastname;
	private int age;
	private String email;
	private long phone;
	private String username;
	private String password;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstName) {
		this.firstname = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastName) {
		this.lastname = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o != null && o instanceof User) {
			User u = (User) o;
			if (username.equalsIgnoreCase(u.getUsername()) && password.equals(u.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "User: "+username+" has name: "+firstname+" "+lastname+" with contanct details as: "+phone+" email: "+email;
	}
}
