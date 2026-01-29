/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

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
		
		System.out.println("=================================================");
	
		int x = 0;
		int amt2 = 3;
		int [] arr2 = new int[1001];
	
		while(x<arr2.length){
			arr2[x] = amt2;
		
			System.out.print(arr2[x] + " ");
		
			x ++;
			amt2 = amt2 + 3;
		}
	
	}
}
