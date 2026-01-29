/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your name");
	String name = sc.nextLine();
	System.out.println("Please enter an integer");
	int x = sc.nextInt();
	int y = 0;
	
	while(true){
		System.out.println(y + " " + name);
		if(y < x){
			y = y + 1;
		}
		if(y >= x){
			break;
		}
		
		
	}



		
	}
}
