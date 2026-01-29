/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What character would you like to print?");
		String chars = sc.nextLine();
		
		System.out.println("What do you want the height of your box to be?");
		int height = sc.nextInt();
		
		System.out.println("What do you want the width of your box to be?");
		int width = sc.nextInt();
		
		for(int h = 0; h < height; h ++){
			
			System.out.println();
			
			for(int w = 0; w < width; w ++){
				
				System.out.print(chars);
				
			}
			
		}


		
	}
}
