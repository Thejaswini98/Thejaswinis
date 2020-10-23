/**
 * 
 * @author Thejaswini
 * Desc : To result names with salutations
 *
 */
public class Naming {
	public static void main(String[] args) {
		String arr[][]=new String[2][];
		arr[0]=new String[3];
		arr[1]=new String[5];
		//Salutations
		arr[0][0]="Mr";
		arr[0][1]="Mrs";
		arr[0][2]="Miss";
		//Names
		arr[1][0]="Pratik";
		arr[1][1]="Aishwarya";
		arr[1][2]="Surya";
		arr[1][3]="Rohan";
		arr[1][4]="Rakesh";
		//Displaying names wid salutations
		System.out.println(arr[0][0]+" "+arr[1][0]);
		System.out.println(arr[0][2]+" "+arr[1][1]);
		System.out.println(arr[0][1]+" "+arr[1][2]);
		System.out.println(arr[0][0]+" "+arr[1][3]);
		System.out.println(arr[0][0]+" "+arr[1][4]);

		//System.out.println("arr[0][0]----->"+arr[0][0]);
		
		
	}

}
