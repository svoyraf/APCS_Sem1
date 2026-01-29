/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String ans = sc.nextLine();
		
		if((ans.equals("Wizard")) || (ans.equals("wizard"))){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if((ans.equals("Rogue")) || (ans.equals("rogue"))){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else if((ans.equals("Warrior")) || (ans.equals("warrior"))){
			System.out.println("You've chosen the Warrior! For honor!");
	
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
			
		
	}
}
