/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100."); 
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y) :");
		String ans1 = sc.nextLine();
		int balance = 100;
		
		
		while((ans1.equals("Yes")) || (ans1.equals("yes")) || (ans1.equals("Y")) || (ans1.equals("y"))){
			System.out.println("You have $" + balance +  " How much would you like to wager?");
			int wager = sc.nextInt();
			if(wager<=balance){
				int slot1 = (int) (Math.random()*10) + 1;
				int slot2 = (int) (Math.random()*10) + 1;
				int slot3 = (int) (Math.random()*10) + 1;
				System.out.println("Great! Let's play!!!");
				System.out.println("Here are your rolls:");
				System.out.println("_______________________");
				System.out.println(" |" + slot1 + " |" + slot2 + " |" +  slot3 + " |");
				System.out.println("_______________________");
				if((slot1 != slot2) || (slot1 != slot3) || (slot3 != slot2)){
					System.out.println("Didn't win this time, better luck next time!");
					balance = (balance - wager);
					System.out.println("You now have $" + balance);
				}
				if(((slot1 == slot2) || (slot1 == slot3) || (slot3 == slot2))){
					balance = balance + (wager *2);
					System.out.println("You won! you now have $" + balance);
				}
				if(((slot1 == slot2) && (slot1 == slot3) && (slot3 == slot2))){
					balance = balance + (wager *2);
					System.out.println("You won! you now have $" + balance);
				}
				
				if(balance <= 0){
					System.out.println("You are bankrupt... stop testing..!");
					break;
				}
					
				
			}
				if(wager>balance){
					System.out.println("You only have $" + balance + " Please enter a smaller number :");
					sc.nextInt();
					
				}
				
			
		}
		if((ans1.equals("No")) || (ans1.equals("no")) || (ans1.equals("N")) || (ans1.equals("n"))){
			System.out.println();
			System.out.println("Sad to see you go! You still have " + balance + " left. Come again soon! Thanks!");
		}
		
		
		
		
	}
}
