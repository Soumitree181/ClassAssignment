package com.day15_q2;

public class Sourching {
	int id;
	String name;
	double basicSalery;
	double HRAPer;
	double DAPer;
	int enrollmentTarget;
	double enrollmentReached;
	int perKPerEnrollment;
	
	public Sourching(int id, String name, double basicSalery, double hRAPer, double dAPer, int enrollmentTarget,
			double enrollmentReached, int perKPerEnrollment) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalery = basicSalery;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perKPerEnrollment = perKPerEnrollment;
	}

	public double calculateGrossSalary()
	{
		double gs=(basicSalery+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*perKPerEnrollment);
		return gs;
	}

}
