/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", " Schrute", 4416.66);
		Dwight.raiseSalary(150);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474, "Jim", " Halpert", 4416.66);
		Jim.raiseSalary(200);
		Jim.employeeToString();
		
		Employee Pam = new Employee(2011, "Pam", " Beesly", 2250);
		Dwight.raiseSalary(67);
		Pam.employeeToString();
		
		Employee Enzo = new Employee(6767, "Enzo", " Dik", 6.7);
		Enzo.dropSalary(676767);
		Enzo.employeeToString();
		
	
		
	}
}
