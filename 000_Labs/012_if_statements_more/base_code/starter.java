/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please input your first number: ");
	int first = sc.nextInt();
	
	System.out.println("Please input your second number: ");
	int second = sc.nextInt();
	
	boolean x;
	x = (first==second);
	if(x)
	{
		System.out.println("Your numbers are the same! ");
	}
	boolean y;
	y = (first!=second);
	if(y)
	{
		System.out.println("Your numbers are different! ");
	}
	}
}
