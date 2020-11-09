/**
 * @author Thejaswini S
 * desc : a method which accepts the id and the age of people as a Map 
 * and decide if they are eligible for vote. A person is eligible for vote if his age is greater than 18
 */
import java.util.*;
import java.util.Collections;
import java.util.Map;
public class Exercise_6 
{
	public static void main(String[] args)
	{
		/**
		 * creating a new ḤashMap and adding values
		 */
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();
		voterList.put(1, 38);
		voterList.put(2, 15);
		voterList.put(3, 27);
		voterList.put(4, 69);
		List<Integer>voterDetails=votersList(voterList);
		System.out.println(voterDetails);
	}
/**
 * method to iterate over the ArrayList and return key list of people greater than 18 age
 * @param voterList
 * @return
 */
	private static List<Integer> votersList(Map<Integer, Integer> voterList) 
	{
		List<Integer> voterDetails=new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) 
		{
			if(entry.getValue()>18) {
				voterDetails.add(entry.getKey());
			}
		}
		return voterDetails;
	}

}