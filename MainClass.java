/**
 * 
 */

/**
 * @author Brandon
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Salary s = new Salary("Brandon Singh","Oracle Close",01,52000);
		Employee e = new Salary("Jona","London Road", 55 , 100000);
		
		System.out.println("Call from salary Class");
		s.mailcheck();
		System.out.println("call from employee class");
		e.mailcheck();

	}

}
