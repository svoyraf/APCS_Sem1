/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String Owner;
	int AccountNumber;
	int Balance;
	boolean isActive;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		Owner = "unknown";
		AccountNumber = 0;
		Balance = 0;
		isActive = false;
	}
	
	public BankAccount(String o, int an){
		Owner = o;
		AccountNumber = an;
		Balance = 0;
		isActive = true;
	}
	
	public BankAccount(String o, int an, int b){
		Owner = o;
		AccountNumber = an;
		Balance = b;
		isActive = true;
	}

	// -------METHODS-------
	public void checkBalance(){
		System.out.println(AccountNumber);
	}
	
	public void printInfo(){
		System.out.println("Owner: " + Owner);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Balance: $" + Balance);
		System.out.println("isActive?: " + isActive);
	}

}