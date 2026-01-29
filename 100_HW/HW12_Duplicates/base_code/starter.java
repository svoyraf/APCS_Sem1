/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	int i = 19;
	int [] arr = new int [20];
	
	System.out.println("Here are your 20 numbers");
	
	while(i >= 0){
		arr[i] = (int) (Math.random()*10);
		
		System.out.print(arr[i] + " ");
		
		i --;
	}
	
	System.out.println();
	System.out.println("--------------------------");
	
	int a = (int) (Math.random()*10);
	int b = 0;
	int c = 19;
	System.out.println("The Number to look for is: " + a);
	
	while(c >= 0){
		
		if(arr[c] == arr[a]){
			System.out.println("Duplicate found at index " + c);
			b ++;
			c --;
		}
		
		else{
			c--;
		}
		
	}
	
	System.out.println("Total Number for duplicates of " + a + " is " + b);
	
	System.out.println("--------------------------");
	
	System.out.println("Looking for two numbers in a row");
	int d = 0;
	
	while(d < 19){
		if(arr[d] == (arr[d + 1])){
			System.out.println("Two in a row duplicate indexes found at: " + d + " and " + (d - 1) + "and the number is " + arr.length[d]);
			
			d ++;
			
		}
		else{
			d ++;
		}
	}
	
	
	
	
	}
}
