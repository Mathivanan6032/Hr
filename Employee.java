import java.util.*;
package com.generation;

public class Employee 
{
	String firstName,lastName;
	int registration,age,daysWorked,vacationDaysTaken,yearsWorked;
	double salary;
	
	public Employee(String firstName,String lastName, int registration, int age ,int daysWorked, int vacationDaysTaken, int yearsWorked, double salary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.yearsWorked = yearsWorked;
		this.salary = salary;
	}
	 public int timeToRetirement()
	 {
	      // time to retirement = min(60 - age, 40 - yearsWorked)
		 return Math.min(60-age,40-yearsWorked);
		 
	 }

	 public int vacationTimeLeft()
	 {
	       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
		 return (daysWorked/360)*(30-vacationDaysTaken);
	 }

	 public int calculateBonus()
	 {
	       // bonus = 2.2*salary
		   return 2.2*salary;
	 }
	   
	   
	
	
}

