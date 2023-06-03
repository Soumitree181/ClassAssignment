package com.day15_q2;

public class TaxUtil
{
	public double calculcateTax(Employee e){
		if(e.calculateGrossSalary()>30000) {
			return e.calculateGrossSalary()*0.20;
		}
		else
		{
			return e.calculateGrossSalary()*0.05;
		}
		}
		public double calculcateTax(Manager m){
			if(m.calculateGrossSalary()>30000) {
				return m.calculateGrossSalary()*0.20;
			}
			else
			{
				return m.calculateGrossSalary()*0.05;
			}
			
			}
		public double calculcateTax(Trainer t){
			if(t.calculateGrossSalary()>30000) {
				return t.calculateGrossSalary()*0.20;
			}
			else
			{
				return t.calculateGrossSalary()*0.05;
			}
		}
		public double calculcateTax(Sourching s){
			if(s.calculateGrossSalary()>30000) {
				return s.calculateGrossSalary()*0.20;
			}
			else
			{
				return s.calculateGrossSalary()*0.05;
			}
		}
	

}
