/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount Default = new BankAccount();
		
		BankAccount Andrew = new BankAccount("Andrew", 6967, 695);
		Andrew.printInfo();
		System.out.println();
		
		BankAccount MrPoole = new BankAccount("MrPoole", 6767, 1000000);
		MrPoole.printInfo();
		System.out.println();
		
		BankAccount Enzo = new BankAccount("Enzo", 6201);
		Enzo.printInfo();
		System.out.println();
		
		BankAccount Raffi = new BankAccount("Raffi", 1, 100000);
		Raffi.printInfo();
		System.out.println();
		
		

		
	}
}
