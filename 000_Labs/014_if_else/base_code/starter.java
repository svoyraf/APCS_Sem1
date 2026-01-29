/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number 1-1000 ");
		int numb = sc.nextInt();
		
		int vary = (int)(Math.random()*1000);
		boolean x;
		x = (numb != vary);
		if(x){
			System.out.println("Your number wasn't the random number DONT try again you will continue on an endless loop,"); 
			System.out.println("on a journy to get the right number, but it will never happen, and you will be distraught");
			System.out.println("The number was " + vary + ".");
		}
		else{
			System.out.println("Your number was correct... go get a haircut at ADRIAN's barbershop, I'll discount it and make it worth a quarter... 6767");
		}
	}
}
