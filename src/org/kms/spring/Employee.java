package org.kms.spring;

public class Employee {

	int id;
	String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("CALLING DEFAULT CONSTRUCTOR");
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hi!!!" + this.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
