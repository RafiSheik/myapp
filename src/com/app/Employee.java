package com.app;

public class Employee {
	private int a;
	private String name;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [a=" + a + ", name=" + name + "]";
	}
	
	

}
