/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x = (int) Math.random()*200 + 51;
		int [] arr = new int [x];
		
		for(int i = 0; i < arr.length; i++){
			
			arr[i] = (int) (Math.random()*100 + 1);
			System.out.println(arr[i]);
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr [i] < min){
				min = arr[i];
			}
		}
		
		int max = 0;
		for(int i = 0; i < arr.length; i ++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		int average = 0;
		for(int i = 0; i < arr.length; i ++){
			average = average + arr[i];
		}
		
		average = average/(arr.length);
		
		System.out.println("There are " + arr.length + " elements");
		System.out.println("The maximum of the random numbers is: " + max);
		System.out.println("The minimum of the random numbers is: " + min);
		System.out.println("The average of the random numbers is: " + average);

		
	}
}
