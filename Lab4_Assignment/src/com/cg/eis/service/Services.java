package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.Scanner;
/**
 * 
 * @author Thejaswini 
 * Desc: The services class provides various services to the employee
 *
 */
public class Services implements EmployeeService
{	
@Override
	public Employee getEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		/**
		 * asking user to input employee details
		 */
		System.out.println("Enter the employee id: ");
		int id=sc.nextInt();
	    sc.nextLine();
		System.out.println("Enter the employee name:");
		String name=sc.nextLine();
		System.out.println("Enter the employee salary");
		double salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the designation of the employee");
		String designation=sc.nextLine();
		sc.close();
		/**
		 * creating employee object to take inputs
		 */
		Employee employee = new Employee(id,name,salary,designation);
		return employee;
	}
		/**
		 * method to find the insuranceScheme based on the employee's salary and designation
		 * @param emp is an object for which we have to find insurance scheme
		 */
		@Override
		public String findInsurance(Employee emp) {
			if(emp.getSalary()>1000 && emp.getSalary()<=30000 && emp.getDesignation().equalsIgnoreCase("A4"))
			{
				return "LifeInsurance";
			
			}
			else if(emp.getSalary()>1000 && emp.getSalary()<=20000 && emp.getDesignation().equalsIgnoreCase("Consultant"))
			{
				return "HealthInsurance";
			}
			else 
			{
				return "BasicInsurance";
			}
		}

		/**
		 * method to display the details of the employee
		 * @param emp is an object for which we have to find details
		 */
		public void displayDetails(Employee emp)
		{
			System.out.println("Employee Details: ");
			System.out.println("ID :" +emp.getId());
			System.out.println("Name:" +emp.getName());
			System.out.println("Salary :" +emp.getSalary());
			System.out.println("Designation:" +emp.getDesignation());
			System.out.println("Insurance Scheme: " +emp.getInsuranceScheme());
			
		}
	}
