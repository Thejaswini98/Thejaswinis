/**
 * 
 * @author Thejaswini
 * Desc: this package has employee service interface that provides services
 *
 */
package com.cg.eis.service;
/**
 * importing the Employee class
 */
import com.cg.eis.bean.Employee;
/**
 * Desc:Interface to have all basic services to be given to employees
 */
public interface EmployeeService 
{

	Employee getEmployeeDetails();
	String findInsurance(Employee emp);
	void displayDetails(Employee emp);
	
}
