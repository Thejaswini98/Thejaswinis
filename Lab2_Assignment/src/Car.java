/**
 * 
 * @author Thejaswini 
 * Desc : To show how many cars are parked and how many are empty
 *
 */
import java.util.Scanner;
public class Car {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice :  1.Park Car\n2.Get Car\n 3.Show available Parking Slots\n");
		choice=sc.nextInt();
		switch(choice) {
	
			case 1: System.out.println(ParkCar());
			break;
			case 2: System.out.println(GetCar());
			break;
			case 3:
				System.out.println(ShowParking());
				break;
		default: System.out.println("Enter the correct choice!");
	}
	}

	private static char[] ShowParking() {
		// TODO Auto-generated method stub
		int count=0;
    	System.out.println("Available Space in Parking is:");
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=0;j<arr[i].length;j++)
    		{
    			if(arr[i][j].equals("null"))
    			{
    				count++;
    			}
    		}
    		
    	}
    	System.out.println(count);
		return null;
	}

	private static char[] GetCar() {
		int arr[][]=new int[5][];//Initially the array values are null
		
		if(arr[0][1]<100) {
			System.out.println("Enter in first floor");
		}
			else if(arr[0][2]<70 && arr[0][1]==100)
			{
				System.out.println("Enter the second floor");
				
			}
			else if(arr[0][3]<50 && arr[0][2]==70 && arr[0][1]==100)
			{
				System.out.println("Enter the third floor");
			}
			else if(arr[0][4]<20 && arr[0][2]==70 && arr[0][1]==100 && arr[0][3]==50)
			{
				System.out.println("Enter the second floor");
		}
			else (arr[0][5]<10 && arr[0][2]==70 && arr[0][1]==100 && arr[0][4]==20)
			System.out.println("Enter the first floor");

		
		
		return null;

	public static char[] ParkCar() {
		Scanner sc=new Scanner(System.in);
		String name;
		int regnum;
		System.out.println("Enter Owner Name:");
		name=sc.nextLine();
		System.out.println("Enter Car Registration Number:");
		regnum=sc.nextInt();
		return null;
	}
	}
	}
