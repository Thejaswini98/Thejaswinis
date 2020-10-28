/**
 * 
 * @author Thejaswini 
 * Desc : To read a list of intgers and return sum
 *
 */
import java.util.*;
 
public class SumOfIntegers {
    public static void main(String args[]) {
    	int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers:");//Taking integer input
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");//Using StringTokenizer
        while (st.hasMoreTokens()) 
        {
            String num = st.nextToken();
            n = Integer.parseInt(num); //reading integer
            //System.out.println(n);
            sum = sum + n;  //Calculating sum of integers
        }
        System.out.println("sum of the integers is: " + sum);
        
}
}