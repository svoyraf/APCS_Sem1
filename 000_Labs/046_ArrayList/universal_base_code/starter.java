/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<>(3);
		
		System.out.println("What would you like your first cookie to be?");
		String ans = sc.nextLine();
		arr.add(ans);
		
		String choose = "yes";
		
		System.out.println("Would you like to add another cookie? (Yes/No)");
		choose = sc.nextLine();
		
		while(choose.equals("yes")||choose.equals("Yes")){
			
			System.out.println("What would you like your next cookie to be?");
			ans = sc.nextLine();
			arr.add(ans);
			
			System.out.println("Would you like to add another cookie? (Yes/No)");
			choose = sc.nextLine();
			
		}
		
		System.out.println("-------------------------------");
		System.out.println("Here are your cookies: ");
		
		int counter = 1;
		
		for(int i = 0; i < arr.size(); i ++){
			
			System.out.print("Cookie #" + counter + ": ");
			System.out.println(arr.get(i));
			
			counter ++;
			
		}
		
		



	}
}
