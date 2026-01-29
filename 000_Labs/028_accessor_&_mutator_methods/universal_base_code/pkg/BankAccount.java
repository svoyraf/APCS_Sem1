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
	double Balance;
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
	
	public BankAccount(String o, double b){
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
	
	public void displayAccountInfo(){
		System.out.println("Owner: " + Owner);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Balance is: " + Balance);
		System.out.println("is Active?: " + isActive);
		
	}
	
	public String getOwner(){
		return Owner;
	}
	
	public double getBalance(){
		return Balance;
	}
	
	public void setOwner(String owner){
		Owner = owner;
	}
	
	public void closeAccount(){
		isActive = false;
	}
	
	public boolean isActive(){
		return isActive;
	}
	
	public void deposit(double deposit){
		if(isActive = true){
			this.Balance = deposit;
		}
		
	}
	
	public void withdraw(double withdraw){
		if((isActive = true) && (Balance>withdraw)){
			this.Balance = (Balance - withdraw);
		}
		
	}

}