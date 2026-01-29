/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your base number?");
		int ans1 = sc.nextInt();
		System.out.println("What is your exponent?");
		int ans2 = sc.nextInt();
		Power(ans1, ans2);
		
	}
	public static void Power(int a, int b){
		System.out.println("Your answer is: " + ((a * a)*(b - 1)));
	}
}
