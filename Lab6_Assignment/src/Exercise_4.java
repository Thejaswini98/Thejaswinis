/**
 * @author Thejaswini S
 * desc : function which accepts the marks of students as a Hashmap
 *  and return the details of the students eligible for the medals along with type of medal. 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class  Exercise_4{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");         //asking number of students
		int number = sc.nextInt();
		HashMap<Integer, Integer> hashMap = new HashMap<>();           //creating hashMap
		/**
		 * Gets the register number, mark and stores it in to the hashmap
		 */
		for (int i = 0; i < number; i++) {                           //getting the regNo and marks of students
			int regNo = sc.nextInt();
			int mark = sc.nextInt();
			hashMap.put(regNo, mark);
		}
		HashMap<Integer, String> resultMap = getStudents(hashMap); // Function Call

		for (Map.Entry<Integer, String> entry : resultMap.entrySet()) {   //printing resultant map
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println(resultMap);
		sc.close();
	}
	/**
	 * This method should return the details of the students eligible for the medals
	 * along with the medal type.
	 * 
	 * @param hashMap
	 * @return result
	 */
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hashMap) {
		HashMap<Integer, String> result = new HashMap<Integer, String>();
		for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			/**
			 * If the mark is greater than 90 the medal type is gold
			 */
			if (entry.getValue() >= 90) {
				result.put(entry.getKey(), "Gold");
			}
			/**
			 * If the mark is greater than 80 and less than 90 then the medal type is silver
			 */
			else if (entry.getValue() >= 80 && entry.getValue() < 90) {
				result.put(entry.getKey(), "Silver");
			}
			/**
			 * If the mark is greater than 70 and less than 80 then the medal type is bronze
			 */
			else if (entry.getValue() >= 70 && entry.getValue() < 80) {
				result.put(entry.getKey(), "Bronze");
			}
		}
		return result; // Returns the resultant map
	}

	

}