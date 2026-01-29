/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a random number: ");
		int startVal = sc.nextInt();
		
		printPrimes(startVal);
	}
	
	public static boolean checkPrime(int a){
			if(a<=1){
				return false;
			}
			
			int x = 2;
			
			while(x*x<=a){
				if(a % x == 0){
					return false;
				}
				x++;
				
			}
			return true;
		}
			
			public static void printPrimes(int a){
				int x = 2;
				while(x<=a){
				if(checkPrime(x)){
					System.out.println(x);
				}
				x ++;
				
			}
		}
			
		}

