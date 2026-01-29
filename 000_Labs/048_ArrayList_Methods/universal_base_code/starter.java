/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter how many values you want in your ArrayList");
		int ans = sc.nextInt();
		
		ArrayList <Integer> arr = new ArrayList <Integer>();
		
		System.out.println("---------------------------------");
		
		for(int i = 0; i < ans; i ++){
			
			arr.add((int) (Math.random()*100));
			
			System.out.print(arr.get(i) + " ");
			
		}
		
		System.out.println();
		System.out.println("---------------------------------");
		
		double average = 0; 
		
		for(int i = 0; i < arr.size(); i ++){
			
			average += arr.get(i);
			
		}
		
		average = average/arr.size();
		
		System.out.println("The average of your array is: " + average);
		
		int max = 0; 
		
		for(int i = 0; i < arr.size(); i ++){
			
			if(arr.get(i) > max){
				
				max = arr.get(i);
				
			}
			
		}
		
		System.out.println("The largest number in your array is " + max);
			
		int min = 101;
		
		for(int i = 0; i < arr.size(); i ++){
			
			if(arr.get(i) < min){
				
				min = arr.get(i);
				
			}
			
		}
		
		System.out.println("THe smallest number in your array is " + min);
			
		}
		
		
		
	}

