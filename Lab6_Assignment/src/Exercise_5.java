/**
 * @author Thejaswini S
 * desc : method which accepts an array of integer elements 
 * and return the second smallest element in the array
 */
import java.util.*;

public class Exercise_5 {

	public static void main(String[] args) {
		/**
		 * creating an Integer array to store the integer values
		 */
		int[] numbers = { 4, 2, 6, 5, 1 };
		/**
		 * calling getScondSmallest method
		 * 
		 * @param numbers
		 */
		int result = getSecondSmallest(numbers);
		/**
		 * displaying the result
		 */
		System.out.println(result);

	}

	/**
	 * creating method getSecondSmallest by accepting array 
	 * 
	 * @param numbers
	 * @return
	 */
	private static int getSecondSmallest(int[] numbers) {
		/**
		 * creating numberList for storing the array elements into list
		 */
		List<Integer> numberList = new ArrayList<>();
		/**
		 * looping through the array and adding the elements to list
		 */
		for (int i = 0; i < numbers.length; i++) {
			numberList.add(numbers[i]);
		}
		/**
		 * sorting the elements using the collection sort
		 */
		Collections.sort(numberList);
		/**
		 * returning the secondElement
		 */
		return numberList.get(1);
	}
}



	 
 

