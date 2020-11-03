package com.cg.eis.exception;
import java.util.Scanner;

public class Exercise_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of the employee:");
		double salary=sc.nextDouble();
		try
		{
			if(salary<=3000)
				throw new EmployeeException("The entered salary is below 3000");
			else 
				System.out.println("The salaey entered is:" +salary);
		}
		catch(EmployeeException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
