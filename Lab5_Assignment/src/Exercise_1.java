import java.util.*;
public class Exercise_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of a person");
		int age=sc.nextInt();
		try
		{
			if(age<=15)
				throw new InvalidAgeException("The age entered is invalid");
			else 
				System.out.println("The age entered is:"+age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
