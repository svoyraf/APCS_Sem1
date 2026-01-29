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
	static int NextAccountNumber = (int)(Math.random()*(1000-49))+ 50;
	int Balance;
	boolean isActive;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		Owner = "unknown";
		AccountNumber = NextAccountNumber;
		NextAccountNumber = NextAccountNumber + 1;
		Balance = 0;
		isActive = false;
	}
	
	public BankAccount(String o){
		Owner = o;
		AccountNumber = NextAccountNumber;
		NextAccountNumber = AccountNumber + 1;
		Balance = 0;
		isActive = true;
	}
	
	public BankAccount(String o, int b){
		Owner = o;
		AccountNumber = NextAccountNumber;
		NextAccountNumber = AccountNumber + 1;
		Balance = b;
		isActive = true;
	}

	// -------METHODS-------
	public void checkBalance(){
		System.out.println("Balance is: " + Balance);
	}
	
	public void printInfo(){
		System.out.println("Owner: " + Owner);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("isActive?: " + isActive);
	}

}