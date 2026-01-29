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
		System.out.println("Enter a work bru");
		String ans = sc.nextLine();
		
		for(int i = 0; i < ans.length(); i ++){
			System.out.print(i + " ");
			System.out.println(ans.substring(i, i + 1));
		}
		
		
		
		
		


		
	}
}
