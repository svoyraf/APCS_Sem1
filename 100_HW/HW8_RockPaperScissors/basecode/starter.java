/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Would you like to play the computer? (yes/no/done)");
        String ans = sc.nextLine();
        sc.nextLine();
        
        if(ans.equals("yes")){
            System.out.println("Please enter rock/paper/scissors:");
            int computer = (int) (Math.random()*3) + 1;
            String player = sc.nextLine();
            
            if(((player.equals("Rock")) || (player.equals("rock"))) && computer == 1){
                System.out.println("You tied!");
            }
            if(((player.equals("Rock")) || (player.equals("rock"))) && computer == 2){
                System.out.println("You Lost!");
            }
            if(((player.equals("Rock")) || (player.equals("rock"))) && computer == 3){
                System.out.println("You Won!");
            }
            
            if(((player.equals("Scissors")) || (player.equals("scissors"))) && computer == 1){
                System.out.println("You Lost!");
            }
            if(((player.equals("Scissors")) || (player.equals("scissors"))) && computer == 2){
                System.out.println("You Won!");
            }
            if(((player.equals("Scissors")) || (player.equals("scissors"))) && computer == 3){
                System.out.println("You Tied!");
            }
            
            if(((player.equals("Paper")) || (player.equals("paper"))) && computer == 1){
                System.out.println("You Won!");
            }
            if(((player.equals("Paper")) || (player.equals("paper"))) && computer == 2){
                System.out.println("You Tied!");
            }
            if(((player.equals("Paper")) || (player.equals("paper"))) && computer == 3){
                System.out.println("You Lost!");
            }
            
        }
        
        if(ans.equals("no")){
            System.out.println("--------------------------------------------------------------");
            System.out.println("How many times would you like the computer to play itself?");
            int player1 = 0;
            int player2 = 0;
            int amount = sc.nextInt();
            sc.nextLine();
            
            while(amount>0){
                int a = (int) (Math.random()*3) + 1;
                int b = (int) (Math.random()*3) + 1;
                
                if(a > b){
                    player1 ++;
                }
                
                if(a < b){
                    player2 ++;
                }
                
                amount --;
                
            }
            
            System.out.println("Player 1 wins: " + player1);
            System.out.println("Player 2 wins: " + player2);
        }
        

    }
}
