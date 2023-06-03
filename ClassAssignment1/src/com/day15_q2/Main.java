package com.day15_q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TaxUtil u=new TaxUtil();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your type:");
		String type=sc.nextLine();
		System.out.println(type);
		String type1="Employee";
		String type2="Manager";
		String type3="Trainer";
		String type4="Sourching";
		if(type.equals(type1))
		{
		System.out.println("Enter employee id:-");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name:-");
		String name=sc.nextLine();
		System.out.println("Enter employee salary:-");
		double basicSalary=sc.nextDouble();
		System.out.println("Enter employee HRAPer:-");
		double HRAPer=sc.nextDouble();
		System.out.println("Enter employee DAPer:-");
		double DAPer=sc.nextDouble();
		Employee e=new Employee(id,name,basicSalary,HRAPer,DAPer);
		double grossSalary=e.calculateGrossSalary();
		System.out.println("Gross Salary :-"+grossSalary);
		System.out.println("Tax On "+name+" is"+	u.calculcateTax(e));
	
		}
		
		else if(type.equals(type2))
		{
		System.out.println("Enter manager id:-");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter manager name:-");
		String name=sc.nextLine();
		System.out.println("Enter manager salary:-");
		double basicSalary=sc.nextDouble();
		System.out.println("Enter manager HRAPer:-");
		double HRAPer=sc.nextDouble();
		System.out.println("Enter manager DAPer:-");
		double DAPer=sc.nextDouble();
		System.out.println("Enter manager project allowance:-");
		double projectAllowance=sc.nextDouble();
		Manager e=new Manager(id,name,basicSalary,HRAPer,DAPer,projectAllowance);
		double grossSalary=e.calculateGrossSalary();
		System.out.println("Gross Salary :-"+grossSalary);
		
		System.out.println("Tax On "+name+" is"+	u.calculcateTax(e));
		}
		
		else if(type.equals(type3))
		{
		System.out.println("Enter trainer id:-");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter trainer name:-");
		String name=sc.nextLine();
		System.out.println("Enter trainer salary:-");
		double basicSalary=sc.nextDouble();
		System.out.println("Enter trainer HRAPer:-");
		double HRAPer=sc.nextDouble();
		System.out.println("Enter trainer DAPer:-");
		double DAPer=sc.nextDouble();
		System.out.println("Enter trainer batch count:-");
		int batchCount=sc.nextInt();
		System.out.println("Enter trainer perkPerBatch:-");
		double perkPerBatch=sc.nextDouble(); 
		Trainer e=new Trainer(id,name,basicSalary,HRAPer,DAPer,batchCount,
perkPerBatch);
		double grossSalary=e.calculateGrossSalary();
		System.out.println("Gross Salary :-"+grossSalary);
		
		System.out.println("Tax On "+name+" is"+	u.calculcateTax(e));
		}
		
		
		else if(type.equals(type4))
		{
		System.out.println("Enter Sourching id:-");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Sourching name:-");
		String name=sc.nextLine();
		System.out.println("Enter Sourching salary:-");
		double basicSalary=sc.nextDouble();
		System.out.println("Enter Sourching HRAPer:-");
		double HRAPer=sc.nextDouble();
		System.out.println("Enter Sourching DAPer:-");
		double DAPer=sc.nextDouble();
		System.out.println("Enter Sourching enrollment target:-");
		int enrollmentTarget=sc.nextInt();
		System.out.println("Enter Sourching enrollment Reached:-");
		double enrollmentReached=sc.nextDouble();
		System.out.println("Enter Sourching perKPerEnrollment:-");
		int perKPerEnrollment = sc.nextInt();
		Sourching s=new Sourching(id,name,basicSalary,HRAPer,DAPer,enrollmentTarget,
				enrollmentReached,perKPerEnrollment);
		double grossSalary=s.calculateGrossSalary();
		System.out.println("Gross Salary :-"+grossSalary);
		
		System.out.println("Tax On "+name+" is"+	u.calculcateTax(s));
		}
		
		else
		{
			System.out.println("Invalid type!!");
		}
		
	sc.close();

	}

}
