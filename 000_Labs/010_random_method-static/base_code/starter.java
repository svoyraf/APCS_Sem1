/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = (int) (Math.random()*9);
		int y = (int) (Math.random()*10);
		double z = (double) (Math.random()+2.5);
		double a = (double) (Math.random()*589 + 14);
		
		System.out.println("A number between 0 - 9: " + x);
		System.out.println("A number between 0 - 10: " + y);
		System.out.println("A number between 2.5 and 3.5: " + z);
		System.out.println("A number between 14 and 589: " + a);
	}
}
