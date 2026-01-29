/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int random = (int) (Math.random()*1000) + 1;
		
		while(true){
			System.out.println("Please enter a number between 1 and 1000: ");
			int ans = sc.nextInt();
			
			if(ans == random){
		 	System.out.println("You got the number!!! Congrats!");
		 	break;
		 }
		 else if(ans < random){
		 	System.out.println("Your number was too low, guess again");
		 }
		 else{
		 	System.out.println("Your number was too high, guess again");
		 }
		}
		 



		
	}
}
