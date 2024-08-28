package com.tnsif.Day6.Static;

public class Employee {
	public static void main(String[]args) {
		
		Employee obj=new Employee(name, id);

	}
	private static String name;
	private static int id;
	
	static String companyName = "TNS";

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Company= "+companyName+"]";
	}

	

}

