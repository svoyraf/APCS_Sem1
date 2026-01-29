/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Please input your first number: ");
	int first = sc.nextInt();
	
	System.out.println("Please input your second number: ");
	int second = sc.nextInt();
	
	System.out.println("Please input your third number: ");
	int third = sc.nextInt();
	
	boolean big;
	big = ((first>second) && (first>third));
	if(big){
		System.out.println("Your first number is the largest of the three!");
		System.out.println("That number was " + first);
	}
	if ((second>first) && (second>third)){
		System.out.println("Your second number is the largest of the three!");
		System.out.println("That number was " + second);
	}
	if ((third>first) && (third>second)) {
		System.out.println("Your third number is the largest of the three!");
		System.out.println("That number was " + third);
	}
	boolean small;
	small = ((first<second) && (first<third));
	if(small){
		System.out.println("Your first number is the smallest of the three!");
		System.out.println("That number was " + first);
	}
	if ((second<first) && (second<third)){
		System.out.println("Your second number is the smallest of the three!");
		System.out.println("That number was " + second);
	}
	if ((third<first) && (third<second)) {
		System.out.println("Your third number is the smallest of the three!");
		System.out.println("That number was " + third);
	}
	}
}
