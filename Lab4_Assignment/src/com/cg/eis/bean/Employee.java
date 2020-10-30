package com.cg.eis.bean;
/**
 * @author Thejaswini S
 * Desc: Employee class with different attributes such as id, name, salary, designation, insuranceScheme.
 *
 */
public class Employee {
	/**
	 attributes of employee
	 */
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	/**
	 * paramerized constructror
	 */
	public Employee(int id,String name,double salary,String designation)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
	}
	/**
	 * getter for id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * getter for name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 *getter for salary
	 */
	public double getSalary()
	{
		return salary;
	}
	/**
	 * getter for designation
	 */
	public String getDesignation()
	{
		return designation;
	}
	/**
	 *setter for insuranceScheme
	 */
	public void setInsuranceScheme(String insuranceScheme)
	{
		this.insuranceScheme=insuranceScheme;
	}
	/**
	 * getter for insuranceScheme
	 */
	public String getInsuranceScheme()
	{
		return insuranceScheme;
	}

}
