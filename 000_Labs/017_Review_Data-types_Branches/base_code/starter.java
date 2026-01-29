/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String ans1 = sc.nextLine();
		System.out.println();
		
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String ans2 = sc.nextLine();
		System.out.println();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String ans3 = sc.nextLine();
		
		if((ans3.equals("Wizard")) || (ans3.equals("wizard"))){
			System.out.println("You've chosen the Wizard! Excelsior!");
			System.out.println();
		}
		else if((ans3.equals("Rogue")) || (ans3.equals("rogue"))){
			System.out.println("You've chosen the Rogue! How cunning!");
			System.out.println();
		}
		else if((ans3.equals("Warrior")) || (ans3.equals("warrior"))){
			System.out.println("You've chosen the Warrior! For honor!");
			System.out.println();
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		int points = 20;
		
		System.out.println("Strength (1-10): ");
		int strength = sc.nextInt();
		System.out.println("You have " + (points - strength) + " left to spend.");
		
		System.out.println("Strength (1-10): ");
		int dexterity = sc.nextInt();
		System.out.println("You have " + (points - strength - dexterity) + " left to spend.");
		
		System.out.println("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		int smart = points - strength - dexterity - intelligence;
		System.out.println("You have " + smart + " left to spend.");
		while(smart<0){
			
			System.out.println("You don't have enough points,");
			System.out.println("Please input a smaller number");
			intelligence = sc.nextInt();
		}
		
		System.out.println("Intelligence (1-10): ");
		int charisma = sc.nextInt();
		int charm = points - strength - dexterity - intelligence - charisma;
		
		while(charm<0){
			
			System.out.println("You don't have enough points,");
			System.out.println("Please input a smaller number");
			charisma = sc.nextInt();
		}
		
		int leftover = (points - strength - dexterity - intelligence - charisma);
		
		if(leftover > 0){
			
			System.out.println("You have " + leftover + " points left for next time");
			
		}
		
		System.out.println("------------------------------------");
		System.out.println("You are " + ans1 + ", the " + ans2 + " of CVHS");
		System.out.println("You're a " + ans3 + ", with the following stats:");
		System.out.println("Strength - " + (points - strength - dexterity));
		System.out.println("Dexterity - " + (points - strength - dexterity - intelligence));
		System.out.println("Intelligence - " + smart);
		System.out.println("Charisma - " + charm);
		
		
		
		
	}
}
