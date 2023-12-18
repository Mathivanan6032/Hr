package com.generation;

public class SalesRep extends Employee
{
	String salesRepName;
	double salesMade;
	
	public SalesRep(String salesRepName, double salesMade)
	{
		this.salesRepName = salesRepName;
		this.salesMade = salesMade;
	}
	
	
	public int calculateComission()
	{
	      return 0.1*salesMade;
	}
}
