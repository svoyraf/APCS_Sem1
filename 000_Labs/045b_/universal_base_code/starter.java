/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word that you would like to hide in a crossword puzzle");
		String ans = sc.nextLine();
		
		String [][] board = new String [ans.length() + 5][ans.length() + 5];
		
		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
		
		for(int r = 0; r < board.length; r ++){
			
			for(int c = 0; c < board[0].length; c ++){
				
			int random = (int) (Math.random()*letters.length); 
			
			board[r][c] = letters[random];
				
			}
			
		}
		
		int vers = (int) (Math.random()*3) + 1;
		int rand1 = (int) (Math.random()*(board.length-ans.length()));
		int rand2 = (int) (Math.random()*(board.length-ans.length()));
		
		if(vers == 1){
			
			int direction = (int) (Math.random()*4) + 1;
			
			if(direction == 1){
				
				for(int r = 0; r < ans.length(); r++){
					board[rand1 + r][rand2 + r] = ans.substring(r, r + 1);
					
				}
				
			}
			
			else if(direction == 2){
				
				for(int r = 0; r < ans.length(); r++){
					board[rand1 -r][rand2 -r] = ans.substring(r, r + 1);
					
				}
			
			}
			
			else if(direction == 3){
				
				for(int r = 0; r < ans.length(); r++){
					board[rand1 - r][rand2 + r] = ans.substring(r, r + 1);
					
				}
			}
			
			else{
				
				for(int r = 0; r < ans.length(); r++){
					board[rand1 + r][rand2 - r] = ans.substring(r, r + 1);
					
				}
				
			}	
					
		}
		
		if(vers == 2){
			
			int direction = (int) (Math.random()*2) + 1;
			
			if(direction == 1){
				
				for(int r = 0; r < ans.length(); r++){
					board[rand1 + r][rand2] = ans.substring(r, r + 1);
					
				}
				
			}
			
			else{
				
				for(int r = 0; r < ans.length(); r++){
					board[rand1 - r][rand2] = ans.substring(r, r + 1);
					
				}
			}
			
		}
		
		if(vers == 3){
			
			int direction = (int) (Math.random()*2) + 1;
			
			if(direction == 1){
				
				for(int r = 0; r < ans.length(); r++){
					board[rand1][rand2 + r] = ans.substring(r, r + 1);
					
				}
			}
			
			else{
				
				for(int r = 0; r < ans.length(); r++){
					board[rand1][rand2 - r] = ans.substring(r, r + 1);
					
				}
				
			}
			
		}
		
		
		for(int r = 0; r < board.length; r ++){
			
			for(int c = 0; c < board[0].length; c ++){
			
			System.out.print(board[r][c] + " ");
				
			}
			
			System.out.println();
			
		}
		
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		
	}
}
