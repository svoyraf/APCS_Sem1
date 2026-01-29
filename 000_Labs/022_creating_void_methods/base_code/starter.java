/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a sentence!");
		String ans1 = sc.nextLine();
		System.out.println("Write another sentence!");
		String ans2 = sc.nextLine();
		printOne(ans1);
		printBoth(ans1, ans2);
	}
	
	public static void printOne(String a){
		System.out.println(a);
	}
	
	public static void printBoth(String a, String b){
		System.out.println(a + " " + b);
	}
		 



		
	
}
