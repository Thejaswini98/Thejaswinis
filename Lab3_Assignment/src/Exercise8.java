/**
 * 
 * @author Thejaswini S
 * Desc :To check if a string is a positive string
 *
 */
import java.util.*;
public class Exercise8 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String input=sc.next().toLowerCase();  //covert to lower case
			if(CheckString(input).equals(input))
			{
					System.out.println("It is positive String");
			}
			else
				System.out.println("it is negative String");

		}	
		public static String CheckString(String input)
		{
			char array[]=input.toCharArray();   //covert to character array
			Arrays.sort(array);
			String result=String.valueOf(array); //valueOf method returns the relevant Number Object holding the value of the argument passed. 
			return result;
		}
}
