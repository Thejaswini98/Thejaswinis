import java.util.*;

import javax.naming.InvalidNameException;
public class Exercise_2 
{
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first name of the employee:");
	String first_name=sc.nextLine();
	System.out.println("Enter the last name of the employee:");
	String last_name=sc.nextLine();
	try
	{
		if(first_name.length()==0 && last_name.length()==0)
		{
			throw new InvalidNameException("Invalid name");
		}
		else 
			System.out.println("The name of the employee is:"+first_name+""+last_name);
	}
	catch(InvalidNameException e)
	{
		System.out.println(e.getMessage());
	}
	

}
}
