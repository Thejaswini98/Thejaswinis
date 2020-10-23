/**
 * 
 * @author Thejaswini 
 * Desc : Sorting the array string in alphabetical order 
 *
 */
import java.util.Arrays; 
  
public class StringSort  
{ 
    
	public static void main(String[] args) 
    { 
        String inputString = "helloworld"; 
        String outputString = sortStrings(inputString); 
          
       
        System.out.println("Output String : " + outputString); 
    } 
    public static String sortStrings(String inputString) 
    { 
        
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray);
        
    } 
      
    
} 
