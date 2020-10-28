/**
 * 
 * @author Admin
 *
 */
import java.time.LocalDate;
import java.time.Period; 
import java.util.*; 	  
public class PeriodBetween { 
	public static void main(String[] args) 
    { 
        LocalDate start_date = LocalDate.of(2014,12,12);    // Input Start date 
        LocalDate end_date = LocalDate.of(2020,12,12);      // Input End date 
  
        PeriodBetween(start_date,end_date); 				//Call the method
    }
	private static void PeriodBetween(LocalDate start_date, LocalDate end_date) {
	    { 
	  
	        Period diff = Period.between(start_date,end_date); 
	        System.out.print("Difference between two dates is: "); 
	  
	        // Print the result 
	        System.out.printf("%d days,%d months  and %d years ",diff.getDays(),diff.getMonths(), diff.getYears()); 
	    } 
	  
	    } 
	} 
