/**
 * @author Thejaswini 
 * Desc: getting input from user, produce expected output to the user,invoke services offered by the system
 */
package com.cg.eis.pl;
/**
 *import all packages required
 */

import java.util.ServiceConfigurationError;
import com.cg.eis.bean.*;
import com.cg.eis.service.Services;

public class EmployeeTest 
{
	public static void main(String[] args) {
		/**
		 * creating object for service to call
		 */
		Services services=new Services();
		/*
		 * getting input from getEmployeeDetails() method
		 */
		
		Employee newEmployee = services.getEmployeeDetails();
		/**
		 * invoke services offered by the system
		 */
		String insuranceScheme = services.findInsurance(newEmployee);
		newEmployee.setInsuranceScheme(insuranceScheme);
		/**
		 * producing expected output to the user
		 */
		services.displayDetails(newEmployee);
		
	}

}
