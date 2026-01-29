/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number 1-1000 ");
		int numb = sc.nextInt();
		
		int vary = (int)(Math.random()*1000);
		boolean x;
		x = (numb > vary);
		if(x){
			
			System.out.println("Your number was larger than the random number!");
			System.out.println("The number was " + vary + ".");
		}
		else if (numb < vary){
			
			System.out.println("Your number was smaller than the random number!");
			System.out.println("The number was " + vary + "."); 
		}
		else if (numb == vary){
			
			System.out.println("Your number was EQUAL TO the random number!... great job");
		}
		
		
	}
}
