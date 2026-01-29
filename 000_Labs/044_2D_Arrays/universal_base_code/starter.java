/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [][] arr = new int[5][4];
		int num = 1;
		double sum = 0.0;
		
		System.out.println("The array presented is: ");
		
		for(int h = 0; h < arr.length; h ++){
			
			System.out.println();
			
			for(int w = 0; w < arr[0].length; w ++){
				
				arr [h][w] = num;
				sum += arr[h][w];
				num ++;
				
				if(num == 10){
					
					num = 1;
					
				}
				
				System.out.print(arr[h][w]);
				
			}
			
		}
		
		System.out.println();
		
		System.out.println("Your average between the numbers is " + sum/(arr.length * arr[0].length));


		
	}
}
