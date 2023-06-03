package com.day15_q2;

public class Employee {
	int id;
	String name;
	double basicSalery;
	double HRAPer;
	double DAPer;
	public Employee(int id, String name, double basicSalery, double hRAPer, double dAPer) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalery = basicSalery;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}

	
	
	public double calculateGrossSalary()
	{
		double gs=basicSalery+HRAPer+DAPer;
		return gs;
	}
	

}
