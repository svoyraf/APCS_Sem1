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
		
		System.out.println("How many rows would you like in your 2D array?");
		int x = sc.nextInt();
		
		System.out.println("How many columns would you like in your 2D array?");
		int y = sc.nextInt();
		
		int avg = 0;
		
		int [][] arr = new int[x][y];
		
		System.out.println("Here is your array:");
		
		for(int h = 0; h < arr.length; h ++){
			
			System.out.println();
			
			for(int w = 0; w < arr[0].length; w ++){
				
			arr[h][w] = (int) (Math.random()*10 +1); 
			
			System.out.print(arr[h][w]);
			avg += arr[h][w];
				
			}
			
		}
		
		System.out.println();
		System.out.println("Which row's average would you like to calculate?");
		int z = sc.nextInt();
		
		int row = 0;
		
		for(int a = 0; a < arr[0].length; a ++){
			
			row += arr[z][a];
			
		}
		
		int amt = arr.length * arr[0].length;
		
		row = row/arr[0].length;
		System.out.println("The average of your row is: ");
		System.out.println(row/(arr[0].length));
		
		System.out.println("The average of your entire array is: ");
		System.out.print((avg/amt));
		
		
	}
}
