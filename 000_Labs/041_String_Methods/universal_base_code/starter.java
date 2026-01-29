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
		System.out.println("Enter a name and a last name with a space inbetween");
		String ans = sc.nextLine();
		
		System.out.println("The last name is " + ans.substring(ans.indexOf(" "),ans.length()));


		
	}
}
