/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int i = 0;
		int amt = 1000;
		int [] arr = new int[1001];
	
		while(i<arr.length){
			arr[i] = amt;
			
			System.out.print(arr[i] + " ");
				
			i ++;
			amt --;
		}
		
	}
}
