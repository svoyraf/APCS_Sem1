/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int num1 = sc.nextInt();
		
		System.out.println("Please enter another integer: ");
		int num2 = sc.nextInt();
		System.out.println();
		
		boolean even1;
		even1 = num1 % 2 == 0;
		if(even1){
			
			System.out.println(num1 + " is an even number");
			
		}
		else{
			
			System.out.println(num1 + " is an odd number");
			
		}
		
		boolean even2;
		even2 = num2 % 2 == 0;
		if(even2){
			
			System.out.println(num2 + " is an even number");
			
		}
		else{
			
			System.out.println(num2 + " is an odd number");
			
		}
		
		System.out.println();
		
		boolean divby1;
		divby1 = ((num1 % 3 == 0) && (num1 % 4 == 0) && (num1 % 5 == 0));
		if (divby1){
			
			System.out.println(num1 + " is divisible by all 3, 4, and 5");
			
		}
		else{
			
			System.out.println(num1 + " is not divisible by all 3, 4, and 5");
			
		}
		
		boolean divby2;
		divby2 = ((num2 % 3 == 0) && (num2 % 4 == 0) && (num2 % 5 == 0));
		if (divby2){
			
			System.out.println(num2 + " is divisible by all 3, 4, and 5");
			
		}
		else{
			
			System.out.println(num2 + " is not divisible by all 3, 4, and 5");
			
		}
		
		
	}
}
