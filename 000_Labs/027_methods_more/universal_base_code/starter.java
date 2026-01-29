/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the bank of redbull would you like to: (Type 1 2 or 3)");
		System.out.println("1) Open new account (No Info)");
		System.out.println("2) Open new account (Name only)");
		System.out.println("3) Open new account (Name + Deposit)");
		BankAccount acc = new BankAccount();
		int ans = sc.nextInt();
		
		if(ans == 1){
			sc.nextLine();
			acc = new BankAccount();
		}
		
		if(ans == 2){
			sc.nextLine();
			System.out.println("Please enter your account name: ");
			String name = sc.nextLine();
			acc = new BankAccount(name);
		}
		
		if(ans == 3){
			sc.nextLine();
			System.out.println("Please enter your account name: ");
			String name = sc.nextLine();
			System.out.println("please enter your deposit amount:");
			int deposit = sc.nextInt();
			acc = new BankAccount(name, deposit);
		}
		sc.nextLine();
		System.out.println("Would you like to check you Balance?");
		String ans2 = sc.nextLine();
		 if((ans2.equals("Yes")) || (ans2.equals("yes"))){
		 	acc.checkBalance();
		 }
		sc.nextLine();
		System.out.println("Would you like to print your account info?");
		String ans3 = sc.nextLine();
		if((ans3.equals("Yes")) || (ans3.equals("yes"))){
		 	acc.printInfo();
		 }
	}
}
