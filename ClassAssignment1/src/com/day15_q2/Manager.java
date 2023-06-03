package com.day15_q2;

public class Manager {
	int id;
	String name;
	double basicSalery;
	double HRAPer;
	double DAPer;
	double projectAllowance;
	
	public Manager(int id, String name, double basicSalery, double hRAPer, double dAPer, double projectAllowance) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalery = basicSalery;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}
	
	public double calculateGrossSalary()
	{
		double gs=basicSalery+HRAPer+DAPer+projectAllowance;
		return gs;
	}
	

}
