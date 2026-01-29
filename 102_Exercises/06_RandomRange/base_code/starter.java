/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a random integer");
		int var1 = sc.nextInt();
		
		System.out.println("Pick another random integer (Bigger than the first number)");
		int var2 = sc.nextInt();
		
		while(var1>var2){
			
			System.out.println("Pick another randon integer (bigger than the first number)");
			var2 = sc.nextInt();
			
		}
		
		int one = (int)(Math.random()*(var2+1-var1) + var1);
		int two = (int)(Math.random()*(var2+1-var1) + var1);
		int three = (int)(Math.random()*(var2+1-var1) + var1);
		int four = (int)(Math.random()*(var2+1-var1) + var1);
		int five = (int)(Math.random()*(var2+1-var1) + var1);
		
		System.out.println("Here are 5 numbers generated in that range");
		System.out.print(one + " ");
		System.out.print(two + " ");
		System.out.print(three + " ");
		System.out.print(four + " ");
		System.out.print(five);
		
		
		
		
		
		
		
	}
}
