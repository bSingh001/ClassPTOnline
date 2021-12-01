
public class Employee 
{
	//properties
	private String name;
	private String address;
	private int number_of_Address;
	
	//constructor
	public Employee(String N, String A, int num)
	{
		System.out.println("We are busy constructing an employee");
		name = N;
		address = A;
		number_of_Address = num;
	}
	
	//method
	public void mailcheck()
	{
		System.out.println("mailing to " + name + " " + address);
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	
	//getter
	public String getAddress()
	{
		return address;
	}
	
	//setter
	public void setAddress(String AD)
	{
		address = AD;
	}
	
	public int getNumber()
	{
		return number_of_Address;
	}
	
}
