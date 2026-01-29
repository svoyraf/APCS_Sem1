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
		
		System.out.println("Please enter a sentence");
		String ans = sc.nextLine();
		
		int x = ans.indexOf(" ");
		int y = ans.length();
		
		String first;
		if( x == -1){
			
			first = ans;
			
		}
		
		else{
			
			first = ans.substring(0, x);
			
		}
		
		String answer = "";
		
		x = ans.lastIndexOf(" ");
		y = ans.length();
		
		while(x != -1){
			
			String part = ans.substring( x + 1, y);
			answer = answer + part + " ";
			
			y = x;
			x = ans.lastIndexOf(" ", x - 1);
			
		}
		
		answer = answer + first;
		
		System.out.println(answer);
		
	}
	
}
