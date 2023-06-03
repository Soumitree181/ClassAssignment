package com.day15_q2;

public class Trainer {
	int id;
	String name;
	double basicSalery;
	double HRAPer;
	double DAPer;
	int batchCount;
	double perkPerBatch; 
	
	public Trainer(int id, String name, double basicSalery, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalery = basicSalery;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public double calculateGrossSalary()
	{
		double gs=basicSalery+HRAPer+DAPer+(batchCount*perkPerBatch);
		return gs;
	}

}
