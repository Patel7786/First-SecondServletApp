package com.student.manage;

public class Student {
	
	public Student(String city, String name, String standard) {
		super();
		this.City = city;
		this.Name = name;
		this.standard = standard;
	}
	private String City;
	private String Name;
	private String standard;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getName() {
		return this.Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStandard() {
		return this.standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [City=" + City + ", Name=" + Name + ", standard=" + standard + "]";
	}
	
}
