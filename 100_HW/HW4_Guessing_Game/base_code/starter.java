/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int choose = (int)(Math.random()*3+1);
		System.out.println("The goal of the game is to guess a word with two hints!");
		if(choose == 1){
			
			System.out.println("It's a car brand!");
			String ans1 = sc.nextLine();
			
			if((ans1.equals("Mercedes")) || (ans1.equals("mercedes"))){
				
				System.out.println("You are correct!");
			
			}
			else{
				
				System.out.println("It is a german car brand! ");
				String ans2 = sc.nextLine();
				
				if((ans2.equals("Mercedes")) || (ans2.equals("mercedes"))){
					
					System.out.println("You are correct!");
					
				
			}
			
			else{
				
				System.out.println("The answer was Mercedes, better luck next time...!");
				
			}
			
			
		}
		
		
	}
	
		if(choose == 2){
			
			System.out.println("It is a rapper");
			String ans3 = sc.nextLine();
			
			if((ans3.equals("Travis Scott")) || (ans3.equals("travis scott"))){
				
				System.out.println("You are correct!");
			
			}
			else{
				
				System.out.println("He his from Houston, TX");
				String ans4 = sc.nextLine();
				
				if((ans4.equals("Travis Scott")) || (ans4.equals("travis scott"))){
					
					System.out.println("You are correct!");
					
				
			}
			
			else{
				
				System.out.println("The answer was Travis Scott, better luck next time...!");
				
			}
			
			
		}
		
		
	}
	
		if(choose == 3){
			
			System.out.println("It is a drink");
			String ans5 = sc.nextLine();
			
			if((ans5.equals("Redbull")) || (ans5.equals("redbull"))){
				
				System.out.println("You are correct!");
			
			}
			else{
				
				System.out.println("It is an energy drink!");
				String ans6 = sc.nextLine();
				
				if((ans6.equals("Redbull")) || (ans6.equals("redbull"))){
					
					System.out.println("You are correct!");
					
				
			}
			
			else{
				
				System.out.println("The answer was Redbull, better luck next time...!");
				
				}
			
			
			}
		
		
		}
	}
}
