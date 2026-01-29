/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int a = 0;
		int b = 0;
		
		Wizard[] arr1 = new Wizard[100];
		
		for(int i = 0; i < arr1.length; i ++){
			arr1[i] = new Wizard();
		}
		
		Warrior[] arr2 = new Warrior[100];
		
		for(int i = 0; i < arr2.length; i ++){
			arr2[i] = new Warrior();
		}
		
		while((a < 100) && (b < 100)){
			
			arr1[a].attack(arr2[b]);
			if(arr2[b].isDead() == true){
				b ++;
			}
			
			arr2[b].attack(arr1[a]);
			if(arr1[a].isDead() == true){
				a ++;
			}
		}
		
		if( a < b){
			int c = a;
			int d = 100 - c;
			System.out.println("The Wizards won !" + d + " Wizards survived");
		}
		
		if( b < a){
			int e = b;
			int f = 100 - e;
			System.out.println("The Warrios won !" + f + " Warriors survived");
		}
	}
}
