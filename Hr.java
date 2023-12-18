
public class Hr 
{

	public static void main(String[] args)
	{
		Employee ram = new Employee("Ram","Raj",000,27,250,21,1,15000);
		Employee sam = new Employee("Sam","nelson",001,30,222,34,1,15000);
		Employee kamal = new Employee("Kamal","Neela",002,24,605,44,2,17000);
		
		Employee[] emp = {ram,sam,kamal};
		System.out.println("Employee details:");
		for(Employee e: emp)
		{
			System.out.println(e.firstName+" "+e.lastName);
			System.out.println("Time to Retirement: "+e.timeToRetirement());
			System.out.println("Vacation Time Left: "+e.vacationTimeLeft());
			System.out.println("Bonus: "+e.calculateBonus());
			System.out.println("/n");

		}
		
		SalesRep balu = new SalesRep("Balu",76.67);
		System.out.println(balu.salesRepName+" comission is: "+balu.calculateComission());

		SalesManager gokul = new SalesManager();
		System.out.println(gokul.calculateComission());
		

	}
}
