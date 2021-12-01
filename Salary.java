
public class Salary extends Employee
{
	//property
	private double salary;
	
	//constructor
	public Salary(String name,String Ad,int n,double s)
	{
		super(name,Ad,n);
		setSalary(s);
	}
	
	public void setSalary(double newSalary)
	{
		if(salary >= 0.0)
		{
			salary = newSalary;
		}
	}
	
	
	public void mailcheck()
	{
		System.out.println("Hey, this is coming from Salary class");
		System.out.println("Mailing check to "+ getName() + " with Salary of " + salary/52);
	}
	
	public double computePay()
	{
		System.out.println("Computing salary for "+ getName());
		return salary/52;
	}
}
